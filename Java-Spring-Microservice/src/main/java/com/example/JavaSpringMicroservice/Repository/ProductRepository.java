package com.example.JavaSpringMicroservice.Repository;


import com.example.JavaSpringMicroservice.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
