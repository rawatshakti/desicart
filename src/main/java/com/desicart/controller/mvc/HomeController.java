package com.desicart.controller.mvc;

import com.desicart.service.impl.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @Autowired
    HomeService service;

    @GetMapping("/")
    public String home() {
        return "home";
    }
}