package com.fyz.learn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Fucai
 * @date 2018/4/19
 */
@RefreshScope
@RestController
public class TestController {


  @Value("${custom_info}")
  private String from;

  @RequestMapping("/from")
  public String from() {
    return this.from;
  }


}
