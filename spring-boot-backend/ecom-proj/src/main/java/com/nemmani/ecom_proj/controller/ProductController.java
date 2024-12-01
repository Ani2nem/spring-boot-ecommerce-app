package com.nemmani.ecom_proj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nemmani.ecom_proj.model.Product;
import com.nemmani.ecom_proj.service.ProductService;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService service;

    // constructor injection
    @Autowired
    public ProductController(ProductService service){
        this.service = service;
    }


    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts(){
        return new ResponseEntity(service.getAllProducts(), HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> geProduct(@PathVariable int id){
        Product product = service.getProductById(id);
        if (product != null)
            return new ResponseEntity<>(product, HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}

