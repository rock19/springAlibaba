package com.microservice;
import com.alibaba.cloud.nacos.ribbon.NacosRule;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.WeightedResponseTimeRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//配置负载均衡
@Configuration
public class RibbonRandomRuleConfig {
    //配置类方法名一定要叫iRule
    @Bean
    public IRule iRule(){
        //return new RandomRule();
        System.out.println("策略：WeightedResponseTimeRule");
        //return new WeightedResponseTimeRule();
        return new RandomRule();
    }
}
