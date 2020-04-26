package com.desicart.controller.mvc;

import com.desicart.service.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class LoginController {

    @Autowired
    ILoginService service;

}