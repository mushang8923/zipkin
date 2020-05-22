package cn.fanyc.action.spring.cloud.action08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 服务注册中心启动类
 *
 * @author Fanyc
 * @date 2019/12/12 22:27
 */
@SpringBootApplication
@EnableEurekaServer
public class Action08EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(Action08EurekaServerApplication.class, args);
    }
}
