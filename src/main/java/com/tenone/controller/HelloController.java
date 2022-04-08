package com.tenone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Hiphonjohn
 * @version 1.0
 * @date 2022/3/18 21:55
 **/

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello() {
        return "hello world!";
    }
}
