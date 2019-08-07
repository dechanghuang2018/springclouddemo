package com.qianfeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 主程序
 *
 */
@SpringBootApplication
@EnableEurekaClient  // 启用客户端
public class ProviderUser {
    public static void main( String[] args ) {
//        SpringApplication.run(ProviderUser.class, args);
        SpringApplication.run(ProviderUser.class);
    }
}
