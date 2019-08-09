package com.qianfeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;


/**
 * 主程序
 */
@SpringBootApplication
@EnableEurekaClient  // 启用客户端
@EnableFeignClients
public class ConsumerOrder {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerOrder.class, args);
    }
}
