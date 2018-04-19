package com.fzy.learn.config;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Fucai
 * @date 2018/4/19
 */
@Configuration
public class MultipartSupportConfig {
    @Bean
    public Encoder feignFormEncoder() {
      return new SpringFormEncoder();
    }
}
