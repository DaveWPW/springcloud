package com.dave.spring.cloud.service.admin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Dave
 * @Date: 2019/11/11 21:20
 * @Description: TODO
 */
@RestController
public class AdminController {

    // @Value默认加载application.yml配置
    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHello(String message) {
        return String.format("Hi，your message is : %s i am from port : %s", message, port);
    }
}
