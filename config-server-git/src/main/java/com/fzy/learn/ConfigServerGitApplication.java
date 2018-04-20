package com.fzy.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//添加@EnableConfigServer注解，开启Spring Cloud Config的服务端功能
@EnableConfigServer
@SpringBootApplication
public class ConfigServerGitApplication {

	public static void main(String[] args){
		SpringApplication.run(ConfigServerGitApplication.class, args);

	}

}
