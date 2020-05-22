package cn.fanyc.action.spring.cloud.action08;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin2.server.internal.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(cn.fanyc.action.spring.cloud.action08.ZipkinServerApplication.class, args);
	}
}
