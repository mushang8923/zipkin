package cn.fanyc.action.spring.cloud.action08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 用户服务提供者启动器
 *
 * @author Fanyc
 * @date 2019/12/12 23:04
 */
@SpringBootApplication
@EnableEurekaClient
public class Action08EurekaProviderUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(Action08EurekaProviderUserApplication.class, args);
    }
}
