package cn.fanyc.action.spring.cloud.action08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 创建启动类
 */
@SpringBootApplication
@EnableEurekaClient
public class Action08EurekaProviderGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(Action08EurekaProviderGoodsApplication.class, args);
    }
}
