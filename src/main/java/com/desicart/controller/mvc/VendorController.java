package com.desicart.controller.mvc;

import com.desicart.data.viewmodel.ProductViewModel;
import com.desicart.data.viewmodel.VendorViewModel;
import com.desicart.service.IProductService;
import com.desicart.service.IVendorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/vendor")
public class VendorController {

    @Autowired
    IProductService productService;

    @Autowired
    IVendorService vendorService;

    @RequestMapping(value = "/", method = {RequestMethod.GET})
    public String getVendors(VendorViewModel vendorViewModel, final ModelMap modelMap) {
        modelMap.addAttribute("vendors", vendorService.getVendors());

        return "home";
    }

    @RequestMapping(value = "/inventory", method = {RequestMethod.POST})
    public String getProductsForSelectedVendor(VendorViewModel vendorViewModel, final ModelMap modelMap) {
        modelMap.addAttribute("vendors", vendorService.getVendors());
        modelMap.addAttribute("products", productService.getProductsByVendor(vendorViewModel.getId()));

        return "home";
    }

    @GetMapping("/cart")
    public String cart() {
        //service.getProducts();
        return "cart";
    }
}