package org.ydy.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.ydy.service.impl.ApiService1Impl;

@FeignClient(value = "eurekaclient",fallback = ApiService1Impl.class)
public interface ApiService1 {
    @RequestMapping(value = "/sayhello",method = RequestMethod.GET)
    public String sayhello();
}
