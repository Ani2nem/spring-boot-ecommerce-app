package com.nemmani.ecom_proj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.nemmani.ecom_proj.model.Product;
import com.nemmani.ecom_proj.repo.ProductRepo;

@Service
public class ProductService {


    // create an object of the productRepo os we can use JPA functions on it.
    @Autowired
    private ProductRepo repo;

    public List<Product> getAllProducts(){
        return repo.findAll();
    }

    public Product getProductById(int id){
        return repo.findById(id).orElse(null);
    }
}
