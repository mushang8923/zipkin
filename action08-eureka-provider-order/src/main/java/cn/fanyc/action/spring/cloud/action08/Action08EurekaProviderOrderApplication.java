package cn.fanyc.action.spring.cloud.action08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

/**
 * 创建启动类
 */
@SpringBootApplication
@EnableEurekaClient
public class Action08EurekaProviderOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(Action08EurekaProviderOrderApplication.class, args);
    }

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        // 设置超时时间
        SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
        factory.setConnectTimeout(5*1000);
        factory.setReadTimeout(5*1000);
        RestTemplate template = new RestTemplate(factory);
        template.getMessageConverters().set(1,new StringHttpMessageConverter(StandardCharsets.UTF_8));
        return template;
    }
}
