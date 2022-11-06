package com.example.JavaSpringMicroservice.controller;

import com.example.JavaSpringMicroservice.Repository.ProductRepository;
import com.example.JavaSpringMicroservice.dto.ProductRequest;
import com.example.JavaSpringMicroservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequest productRequest){

    }

    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Product> getProduct(@RequestBody ProductRequest productRequest){
        return repo.findAll();
    }
}
