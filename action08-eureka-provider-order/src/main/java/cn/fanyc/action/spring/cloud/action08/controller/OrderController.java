package cn.fanyc.action.spring.cloud.action08.controller;

import cn.fanyc.action.spring.cloud.action08.model.OrderInfoBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 订单管理服务
 *
 * @author Fanyc
 * @date 2019/12/6 22:05
 */
@RestController
@RequestMapping("/v1/order")
public class OrderController {

    @Autowired
    RestTemplate restTemplate;

    /**
     * 获取订单信息
     *
     * @param orderId 订单ID
     * @return 订单信息
     */
    @GetMapping("/{orderId}")
    public OrderInfoBean getOrderInfo(@PathVariable("orderId") String orderId) {
        return new OrderInfoBean()
                .setOrderId(orderId)
                .setRemark("测试鱼的测试手机订单")
                .setUserId("1101")
                .setPrice(BigDecimal.valueOf(12.34));
    }

    /**
     * 获取用户的订单列表
     *
     * @param userId 用户ID
     * @return 订单列表信息
     */
    @GetMapping("/getUserOrderList/{userId}")
    public List<OrderInfoBean> getUserOrderList(@PathVariable("userId") String userId) {
        // 模拟构造订单列表
        List<OrderInfoBean> result = new ArrayList<>(3);
        for (int i = 1; i < 4; i++) {
            String orderId = "2019121300" + i;
            // 获取订单的商品信息
            List goods = restTemplate.getForObject("http://GoodsProvider/v1/goods/getOrderGoodsList/" + orderId, List.class);
            OrderInfoBean order = new OrderInfoBean()
                    .setOrderId(orderId)
                    .setRemark("测试鱼的第" + i + "部手机订单")
                    .setUserId(userId)
                    .setPrice(BigDecimal.valueOf(12.34).multiply(BigDecimal.valueOf(i)))
                    .setGoods(goods);
            result.add(order);
        }

        return result;
    }
}
