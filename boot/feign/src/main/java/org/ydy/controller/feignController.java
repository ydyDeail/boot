package org.ydy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.ydy.service.ApiService1;
import org.ydy.service.ApiService2;

@RestController
public class feignController {
    @Autowired
    private ApiService1 apiService1;
    @Autowired
    private ApiService2 apiService2;
    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public Object feign(){
        String s1=apiService1.sayhello();
        String s2=apiService2.sayhello2();
        return "test"+s1+","+s2;
    }
}
