package com.microservice.order.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/add")
    @LoadBalanced
    public String add()
    {
        System.out.println("δΈεζε");
        String msg=restTemplate.getForObject("http://stock-server/stock/reduct",String.class);

        return "Hello World"+msg;
    }
}

