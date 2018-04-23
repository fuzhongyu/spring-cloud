package com.fzy.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

//@EnableZipkinServer注解来启动Zipkin Server
@EnableZipkinServer
@SpringBootApplication
public class ZipkinApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZipkinApplication.class, args);
  }

}