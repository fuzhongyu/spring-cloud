package com.fzy.learn.controller;

import com.fzy.learn.service.ConsumerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final static Logger logger= LoggerFactory.getLogger(DcController.class);

    @Autowired
    private ConsumerService consumerService;

    @GetMapping("/consumer")
    public String dc() {
        logger.info("======== call following-consumer =====");
        return consumerService.consumer();
    }
}