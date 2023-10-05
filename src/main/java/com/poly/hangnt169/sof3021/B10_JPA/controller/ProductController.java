package com.poly.hangnt169.sof3021.B10_JPA.controller;


import com.poly.hangnt169.sof3021.B10_JPA.entity.Product;
import com.poly.hangnt169.sof3021.B10_JPA.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;

    @GetMapping("/roduct/hien-thi")
    public String hienThiProuct(Model model) {
        List<Product> listpr = productService.getAll();
        model.addAttribute("products", listpr);
        return "/buoi10/product";
    }
}
