package com.desicart.controller.mvc;

import com.desicart.data.viewmodel.LoginViewModel;
import com.desicart.service.ILoginService;
import org.apache.http.Header;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class LoginController {

    @Autowired
    ILoginService iLoginService;

    @RequestMapping(value = "login", method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> validateUser(@RequestBody LoginViewModel loginViewModel, final ModelMap modelMap) {
        return new ResponseEntity<>(iLoginService.getLogin(loginViewModel),HttpStatus.OK);
    }
}