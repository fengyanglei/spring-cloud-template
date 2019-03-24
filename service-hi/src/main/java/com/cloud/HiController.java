package com.cloud;

import brave.sampler.Sampler;
import com.cloud.param.UserParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Layne on 2018-9-7.
 */
@RestController
public class HiController {

    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
    @Bean
    public Sampler defaultSampler(){
        return Sampler.ALWAYS_SAMPLE;
    }

    @RequestMapping("/hi2")
    public String callHome(){
        System.out.println("calling trace service-hi");
        return restTemplate.getForObject("http://localhost:8989/member", String.class);
    }
    @RequestMapping("/info")
    public String info(){
        System.out.println("calling trace service-hi ");
        return "i'm service-hi";
    }

}
