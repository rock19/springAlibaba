package com.microservice.order;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/*
高版本使用openfeign 需要使用loadbalancer
    <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-loadbalancer</artifactId>
        </dependency>
而且需要在nacos里排除ribbon
 <dependency>
            <groupId>com.alibaba.cloud</groupId>
            <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
            <exclusions>
                <exclusion>
                    <groupId>org.springframework.cloud</groupId>
                    <artifactId>spring-cloud-netflix-ribbon</artifactId>
                </exclusion>
            </exclusions>
        </dependency>
原文链接：https://blog.csdn.net/weixin_44524763/article/details/121730595
 */
@SpringBootApplication
@EnableFeignClients
public class OrderApplication {
    public static void main(String[] args){
        SpringApplication.run(com.microservice.order.OrderApplication.class,args);
    }

//    @Bean
//    @LoadBalanced //负载均衡器注解 才能访问server
//    public RestTemplate restTemplate(RestTemplateBuilder builder){
//        RestTemplate restTemplate=builder.build();
//        return restTemplate;
//
//
//    }
}
