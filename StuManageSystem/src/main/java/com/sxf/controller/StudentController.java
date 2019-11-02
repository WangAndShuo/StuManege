package com.sxf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/stu")
public class StudentController {

    @RequestMapping("/login")
    public String login(){
        return "index";
    }
}
