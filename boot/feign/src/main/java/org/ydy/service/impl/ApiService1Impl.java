package org.ydy.service.impl;

import org.springframework.stereotype.Component;
import org.ydy.service.ApiService1;
@Component
public class ApiService1Impl implements ApiService1 {
    @Override
    public String sayhello() {
        return "服务器异常";
    }
}
