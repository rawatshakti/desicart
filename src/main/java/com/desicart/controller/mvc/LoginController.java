package com.desicart.controller.mvc;

import com.desicart.data.viewmodel.UserViewModel;
import com.desicart.data.viewmodel.VendorViewModel;
import com.desicart.service.ILoginService;
import com.desicart.service.IVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    ILoginService service;

    @Autowired
    IVendorService vendorService;

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String init(Model model) {
        return "login";
    }

    @RequestMapping(value = "/login", method = {RequestMethod.POST})
    public String submit(@ModelAttribute VendorViewModel vendorViewModel, @ModelAttribute UserViewModel userViewModel, final ModelMap modelMap) throws Exception {
        String loginResp = service.doLogin(userViewModel.getUserName(), userViewModel.getPassword());
        if (loginResp.contains("Welcome")) {
            modelMap.addAttribute("msg", loginResp);
            modelMap.addAttribute("vendors", vendorService.getVendors());
            return "home";
        } else {
            modelMap.addAttribute("error", loginResp);
            return "login";
        }
    }
}
