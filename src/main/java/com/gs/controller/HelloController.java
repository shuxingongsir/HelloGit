package com.gs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    /**
     * 测试
     * @param name 用户名
     * @param password 密码
     * @return 视图名
     */
    @RequestMapping("/test")
    public String test(String name, String password){
        return "hello";
    }
}
