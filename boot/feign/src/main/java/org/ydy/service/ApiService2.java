package org.ydy.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eurekaclient2")
public interface ApiService2 {
    @RequestMapping(value = "/sayhello2",method = RequestMethod.GET)
    public String sayhello2();
}
