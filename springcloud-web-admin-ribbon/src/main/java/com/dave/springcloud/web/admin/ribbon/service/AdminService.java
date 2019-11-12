package com.dave.springcloud.web.admin.ribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: Dave
 * @Date: 2019/11/12 19:06
 * @Description: TODO
 */
@Service
public class AdminService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "backError")
    public String hello(String message){
        return restTemplate.getForObject("http://SPRINGCLOUD-SERVICE-ADMIN/hello?message="+message, String.class);
    }

    public String backError(String message){
        return "Hi，your message is :\"" + message + "\" but request error.";
    }

}
