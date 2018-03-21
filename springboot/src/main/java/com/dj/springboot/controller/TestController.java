package com.dj.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TestController {
    @RequestMapping("Test1")
    public String Test1(){
        return "HELLO WORLD";
    }
    @RequestMapping("Test2")
    public String Test2(){
        return "Test";
    }
}
