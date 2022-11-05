package com.microservice.order;
import com.microservice.RibbonRandomRuleConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
@EnableDiscoveryClient
@RibbonClients(value = {
        @RibbonClient(name = "stock-server",configuration = RibbonRandomRuleConfig.class)
        //为哪个服务端提供负载均衡
})
public class OrderApplication {
    public static void main(String[] args){
        SpringApplication.run(com.microservice.order.OrderApplication.class,args);
    }

    @Bean
    @LoadBalanced //负载均衡器注解 才能访问server
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        RestTemplate restTemplate=builder.build();
        return restTemplate;


    }
}
