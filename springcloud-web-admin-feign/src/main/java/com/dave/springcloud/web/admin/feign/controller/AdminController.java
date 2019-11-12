package com.dave.springcloud.web.admin.feign.controller;

import com.dave.springcloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Dave
 * @Date: 2019/11/12 21:23
 * @Description: TODO
 */
@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String sayHello(@RequestParam String message){
        return adminService.sayHello(message);
    }

}
