package com.kolhun.boot.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class TestController {

    @RequestMapping
    public String indexPage(Model model) {
        model.addAttribute("message", "hello-message");
        return "welcome";
    }


}
