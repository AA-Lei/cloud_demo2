package com.example.serviceribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {
    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "hiError") //开启熔断器的功能
    public String hiService(String name){
        return restTemplate.getForObject("http://service-hi/hi?name=" + name, String.class);
    }

    public String hiError(String name){
        return "sorry," + name + "it's erroe!";

    }
}
