package com.zx.dbo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @RequestMapping("/")
    @ResponseBody
    public Object index(){
        return "Consumer" +  System.currentTimeMillis();
    }
}
