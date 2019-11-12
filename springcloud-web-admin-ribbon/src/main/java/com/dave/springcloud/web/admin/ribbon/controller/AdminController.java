package com.dave.springcloud.web.admin.ribbon.controller;

import com.dave.springcloud.web.admin.ribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Dave
 * @Date: 2019/11/12 19:11
 * @Description: TODO
 */

@RestController
public class AdminController {

    @Autowired
    private AdminService adminService;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(@RequestParam String message){
        return adminService.hello(message);
    }

}
