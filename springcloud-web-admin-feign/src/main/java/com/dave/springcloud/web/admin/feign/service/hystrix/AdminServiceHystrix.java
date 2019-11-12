package com.dave.springcloud.web.admin.feign.service.hystrix;

import com.dave.springcloud.web.admin.feign.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * @Author: Dave
 * @Date: 2019/11/13 0:27
 * @Description: TODO
 */
@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHello(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }

}
