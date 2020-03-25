package com.example.servicefeign.inte.imp;

import com.example.servicefeign.inte.SchedualServiceHi;
import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry," + name + "it's error";
    }
}
