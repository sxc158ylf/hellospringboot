package com.xuecheng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()  // == rest风格 + @ResponseBody @Controller
@RequestMapping("/hello")
public class HelloSpringBoot {

    @RequestMapping("/springboot")
    public String helloSpringBoot() {
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println();
        return "Hello Spring Boot!";
    }
}
