package com.zhangkai.springboot.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
    @GetMapping("/")
    public String  hello(@RequestParam(name = "name",defaultValue = "World",required = false) String name , Model model){
        model.addAttribute("name",name);
        return "index";
    }

}
