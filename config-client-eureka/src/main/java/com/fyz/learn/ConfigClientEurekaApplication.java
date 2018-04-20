package com.fyz.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
//添加@EnableConfigServer注解，开启Spring Cloud Config的服务端功能
@SpringBootApplication
public class ConfigClientEurekaApplication {

	public static void main(String[] args){
		SpringApplication.run(ConfigClientEurekaApplication.class, args);

	}

}
