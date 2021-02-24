package com.controller;

import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("testController")
@RequestMapping("/ssm")
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping("/hello")
    public String helloWorld(){
        return testService.testService();
    }
}
