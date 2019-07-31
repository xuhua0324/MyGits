package com.qf.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author x_h
 * @Date 2019/8/1
 */
@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping("show")
    public String show(){
        return "show";
    }
}
