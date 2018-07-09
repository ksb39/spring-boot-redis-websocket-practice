package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private SimpMessagingTemplate template;

    @RequestMapping("/test")
    public void test() {
        this.template.convertAndSend("/info/demo", "demo");
    }

}
