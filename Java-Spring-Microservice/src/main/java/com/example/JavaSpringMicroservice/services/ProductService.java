package com.example.JavaSpringMicroservice.services;

import com.example.JavaSpringMicroservice.Repository.ProductRepository;
import com.example.JavaSpringMicroservice.dto.ProductRequest;
import com.example.JavaSpringMicroservice.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void createProduct(ProductRequest productRequest){
        Product product = Product.builder().build();
    }
}
