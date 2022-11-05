package com.microservice.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/*
name 指定调用rest接口对应的服务名
path 指定调用rest接口所在的controller指定的@requestmapping
增加feign接口和方法
 */
@FeignClient(name = "stock-server",path = "/stock")
public interface stockfeignserver {
    //声明调用的rest接口对应的方法
    @RequestMapping("/reduct")
    String add();
}

//
//@RequestMapping("/stock")
//public class StockController {
//    @Value("${server.port}")
//    String port;
//
//    @RequestMapping("/reduct")
//    public String add()
//    {
//        System.out.println("扣减库存");
//        return "扣减库存:"+port;
//    }
//}
