package com.qianfeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * 主程序
 *
 */
@SpringBootApplication
public class ConsumerOrder
{
    @Bean
    public RestTemplate getTemp(){
        return new RestTemplate();
    }

    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerOrder.class);
    }
}
