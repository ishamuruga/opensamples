package com.supers.spring.mvc.security.springmvce2esecurity.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyErrorController {
    @RequestMapping("/error")
    public String handleError(HttpServletRequest request) {
        //do something like logging
        System.out.println("E========================");
        return "error";
    }
}
