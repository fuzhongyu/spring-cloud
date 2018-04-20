package com.fzy.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
//添加@EnableConfigServer注解，开启Spring Cloud Config的服务端功能
@EnableConfigServer
@SpringBootApplication
public class ConfigServerGitEurekaApplication {

	public static void main(String[] args){
		SpringApplication.run(ConfigServerGitEurekaApplication.class, args);

	}

}
