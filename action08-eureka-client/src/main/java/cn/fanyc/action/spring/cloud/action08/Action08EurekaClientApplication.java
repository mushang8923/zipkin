package cn.fanyc.action.spring.cloud.action08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

/**
 * 服务请求者启动类
 *
 * @author Fanyc
 * @date 2019/12/13 0:11
 */
@SpringBootApplication
@EnableEurekaClient
public class Action08EurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(Action08EurekaClientApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        RestTemplate template = new RestTemplate();
        template.getMessageConverters().set(1,new StringHttpMessageConverter(StandardCharsets.UTF_8));
        return template;
    }
}
