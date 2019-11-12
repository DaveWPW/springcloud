package com.dave.springcloud.web.admin.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: Dave
 * @Date: 2019/11/12 21:18
 * @Description: TODO
 */
@FeignClient(value = "springcloud-service-admin")
public interface AdminService {

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "message") String message);

}
