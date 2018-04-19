package com.fzy.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//添加@EnableConfigServer注解，开启Spring Cloud Config的服务端功能
@SpringBootApplication
public class ConfigClientApplication {

	public static void main(String[] args){
		SpringApplication.run(ConfigClientApplication.class, args);

	}

}
