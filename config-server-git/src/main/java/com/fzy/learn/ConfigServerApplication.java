package com.fzy.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//添加@EnableConfigServer注解，开启Spring Cloud Config的服务端功能
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {


	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args){
		SpringApplication.run(ConfigServerApplication.class, args);

	}

}
