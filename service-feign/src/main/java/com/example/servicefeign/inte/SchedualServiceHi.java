package com.example.servicefeign.inte;

import com.example.servicefeign.inte.imp.SchedualServiceHystric;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-hi" , fallback = SchedualServiceHystric.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
