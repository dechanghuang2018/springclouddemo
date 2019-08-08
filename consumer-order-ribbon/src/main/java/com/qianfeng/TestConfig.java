package com.qianfeng;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author: hdc
 * @Date: 2019/8/8 10:21
 */
@Configuration
public class TestConfig {

    @Autowired
    IClientConfig clientConfig;

    /**
     * 创建负载均衡算法的方法
     * @param config
     * @return
     */
    @Bean
    public IRule ribbonRule(IClientConfig config){
        return new RandomRule();
    }

}
