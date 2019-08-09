package com.qianfeng.feign;

import com.qianfeng.config.MyFeignClientConfig;
import com.qianfeng.pojo.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Description:
 * @Author: hdc
 * @Date: 2019/8/9 11:09
 */
@FeignClient(name = "provider-user", configuration = MyFeignClientConfig.class)
public interface MyFeignClinet {

//    @RequestMapping(method = RequestMethod.GET, value = "/user/{id}")
    @RequestLine("GET /user/{id}")
    User getOrder(@Param("id") Long id);

}
