package org.ydy.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${server.port}")
    private int port;
    @GetMapping(value = "/sayhello2",produces = "application/json;charset=utf-8")
    public Object sayhello(){
        return "hello2"+port;
    }
}
