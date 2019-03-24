package com.cloud.service;

import com.cloud.api.HiService;
import com.cloud.param.UserParam;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Layne on 2018-9-11.
 */
@RestController
public class HiServiceImpl implements HiService {

    @Value("${server.port}")
    String port;

    @Override
    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String name) {
        return "hi " + name + " ,i am from port:" + port;
    }

    public String hiError(String name) {
        return "hi,"+name+",sorry,error!";
    }

    @Override
    public UserParam save(@RequestBody UserParam userParam) {
        System.out.println(userParam);
        userParam.setSex("1");
        return userParam;
    }
}
