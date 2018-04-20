package com.fzy.learn;

import com.fzy.learn.filter.AccessFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringCloudApplication
public class ApiGatewayApplication {

	public static void main(String[] args){
		SpringApplication.run(ApiGatewayApplication.class, args);

	}

	@Bean
	public AccessFilter accessFilter() {
		return new AccessFilter();
	}

}
