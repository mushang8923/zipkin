package cn.fanyc.action.spring.cloud.action08.controller;

import cn.fanyc.action.spring.cloud.action08.model.UserInfoBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户管理
 *
 * @author Fanyc
 * @date 2019/12/6 22:05
 */
@RestController
@RequestMapping("/v1/user")
public class UserController {

    /**
     * 获取用户信息
     *
     * @param userId 用户ID
     * @return 用户信息
     */
    @GetMapping("/{userId}")
    public UserInfoBean getUserInfo(@PathVariable("userId") String userId) {
        return new UserInfoBean()
                .setUserId(userId)
                .setUserName("测试鱼")
                .setLoginName("fanyc");
    }
}
