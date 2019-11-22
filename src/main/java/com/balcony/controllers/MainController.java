package com.balcony.controllers;

import com.balcony.entities.Product;
import com.balcony.repositorys.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

/**
 * Created by ASUS on 11/15/2019.
 */
@Controller
public class MainController {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping
    public String main(Map<String, Object> model) {
        Iterable<Product> products = productRepo.findAll();
        model.put("Name: ", products);
        return "main";
    }
}
