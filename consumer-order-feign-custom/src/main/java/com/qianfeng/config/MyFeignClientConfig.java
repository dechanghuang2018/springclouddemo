package com.qianfeng.config;

import feign.Contract;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @Author: hdc
 * @Date: 2019/8/9 15:23
 */
@Configuration
public class MyFeignClientConfig {

    @Bean
    public Contract feignContract(){
        return new feign.Contract.Default();
    }
}
