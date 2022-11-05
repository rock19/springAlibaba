package com.microservice.order.config;

import feign.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
全局配置：会将@configuration作用所有的服务提供方
局部配置：如果只想针对某一个服务进行配置，就不要加@configuration
 */
@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }
}


//@RestController
//@RequestMapping("/product")
//public class ProductController {
//    @Value("${server.port}")
//    String port;
//
//    @RequestMapping("/{id}")
//    public String get(@PathVariable Integer id)
//    {
//        System.out.println("查询商品"+id);
//        return "查询商品"+id+"："+port;
//    }
//}