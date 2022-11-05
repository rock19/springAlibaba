package com.microservice.order.controller;
import com.microservice.order.feign.stockfeignserver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
//    @Autowired
//    RestTemplate restTemplate;

    @Autowired
    stockfeignserver stockfeignserver;


    @RequestMapping("/add")
    public String add()
    {
        System.out.println("下单成功");
        String msg =stockfeignserver.add();
    //    String msg=restTemplate.getForObject("http://stock-server/stock/reduct",String.class);

        return "Hello OpenFeign"+msg;
    }
}

