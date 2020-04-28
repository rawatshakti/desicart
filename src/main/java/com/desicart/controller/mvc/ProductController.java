package com.desicart.controller.mvc;

import com.desicart.service.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProductController {

    @Autowired
    ProductServiceImpl service;

    @GetMapping("/inventory")
    public String inventory() {
        service.getProducts();
        return "inventory";
    }

    @GetMapping("/cart")
    public String cart() {
        //service.getProducts();
        return "cart";
    }
}