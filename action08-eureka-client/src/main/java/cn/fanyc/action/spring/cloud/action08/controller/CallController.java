package cn.fanyc.action.spring.cloud.action08.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 请求客户端
 *
 * @author Fanyc
 * @date 2019/12/10 22:40
 */
@RestController
@RequestMapping("/call")
public class CallController {

    /**
     * 日志记录器
     */
    private Logger logger = LoggerFactory.getLogger(CallController.class);

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("getUserInfo")
    public String getUserInfo() {
        return restTemplate.getForObject("http://UserProvider/v1/user/1001", String.class);
    }

    /**
     * 获取用户订单信息接口
     *
     * @return 用户信息和订单信息
     */
    @GetMapping("getUserOrderInfo")
    public Map<String, Object> getUserOrderInfo() {
        logger.debug("进入：getUserOrderInfo");
        // 用户ID
        String userId = "1001";
        // 1. 调用订单服务
        logger.debug("开始调用：OrderProvider");
        List orderResult = restTemplate.getForObject("http://OrderProvider/v1/order/getUserOrderList/"+userId, List.class);
        // 2. 调用用户服务
        logger.debug("开始调用：UserProvider");
        Map userResult = restTemplate.getForObject("http://UserProvider/v1/user/"+userId, Map.class);

        // 返回结果
        Map<String, Object> result = new HashMap<>();
        result.put("order", orderResult);
        result.put("user", userResult);
        return result;
    }
}
