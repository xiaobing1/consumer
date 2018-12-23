package com.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

@Controller
public class ConsumerController {

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping("/consumer.html")
    public String hello() {
        return restTemplate.getForEntity("http://USER-SERVICE/hello.html", String.class).getBody();
    }

}
