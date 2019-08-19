package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String homepage (Model model){
        model.addAttribute("greeting","Hello Everyone");
        model.addAttribute("message", "This is August 19 Spring Boot batch.");
        return "hometemplate";
    }

}
