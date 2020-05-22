package cn.fanyc.action.spring.cloud.action08.controller;

import cn.fanyc.action.spring.cloud.action08.model.GoodsInfoBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品管理服务
 *
 * @author Fanyc
 * @date 2019/12/6 22:05
 */
@RestController
@RequestMapping("/v1/goods")
public class GoodsController {

    /**
     * 获取商品信息
     *
     * @param goodsId 商品ID
     * @return 商品信息
     */
    @GetMapping("/{goodsId}")
    public GoodsInfoBean getGoodsInfo(@PathVariable("goodsId") String goodsId) {
        return new GoodsInfoBean()
                .setGoodsId(goodsId)
                .setGoodsName("测试手机")
                .setPrice(BigDecimal.valueOf(12.34));
    }

    /**
     * 根据订单ID获取商品列表信息
     *
     * @param orderId 订单ID
     * @return 商品列表
     */
    @GetMapping("/getOrderGoodsList/{orderId}")
    public List<GoodsInfoBean> getOrderGoodsList(@PathVariable("orderId") String orderId) {

        // 模拟构造订单的商品列表
        List<GoodsInfoBean> result = new ArrayList<>(2);
        for (int i = 1; i < 3; i++) {
            GoodsInfoBean order = new GoodsInfoBean()
                    .setGoodsId(orderId + "000" + i)
                    .setGoodsName(orderId + "测试手机" + i)
                    .setPrice(BigDecimal.valueOf(12.34).multiply(BigDecimal.valueOf(i)));
            result.add(order);
        }

        // 模拟断路器下响应慢，正常使用时请注释掉
//        try {
//            Thread.sleep(10*1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        return result;
    }
}
