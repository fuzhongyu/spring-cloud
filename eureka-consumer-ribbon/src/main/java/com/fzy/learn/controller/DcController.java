package com.fzy.learn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 *
 * @author Fucai
 * @date 2018/4/19
 */
@RestController
public class DcController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        //利用RestTemplate对象实现对服务提供者接口的调用
        return restTemplate.getForObject("http://eureka-client/dc", String.class);
    }
}