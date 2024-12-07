package com.Taesin.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ArticlesController {
    @GetMapping("/")
    @ResponseBody
    public String hello(){
        return "Hello world!";
    }
}