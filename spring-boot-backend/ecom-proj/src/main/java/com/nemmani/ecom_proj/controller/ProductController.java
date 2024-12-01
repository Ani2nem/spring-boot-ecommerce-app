package com.nemmani.ecom_proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nemmani.ecom_proj.model.Product;
import com.nemmani.ecom_proj.service.ProductService;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService service;

    // constructor injection
    @Autowired
    public ProductController(ProductService service){
        this.service = service;
    }

    @RequestMapping("/")
    public String greet(){
        return "Hello World";
    }

    @GetMapping("/products")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }
}

