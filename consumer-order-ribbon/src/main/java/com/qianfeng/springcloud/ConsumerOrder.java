package com.qianfeng.springcloud;

import com.qianfeng.TestConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 主程序
 *
 */
@SpringBootApplication
@EnableEurekaClient  // 启用客户端
@RibbonClient(name = "PROVIDER-USER", configuration = TestConfig.class)  // 启用 ribbon ，并对进行 PROVIDER-USER负载均衡
public class ConsumerOrder {
    @Bean
    public RestTemplate getTemp(){
        return new RestTemplate();
    }

    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerOrder.class);
    }
}
