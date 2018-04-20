package com.fzy.learn.controller;

import com.fzy.learn.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 *
 * @author Fucai
 * @date 2018/4/19
 */
@RestController
public class DcController {

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc() {
        return consumerService.consumer();
    }
}