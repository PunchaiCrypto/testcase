package com.example.JavaSpringMicroservice.controller;

import com.example.JavaSpringMicroservice.Repository.ProductRepository;
import com.example.JavaSpringMicroservice.dto.ProductRequest;
import com.example.JavaSpringMicroservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @Autowired
    private ProductRepository repo;


    @GetMapping
    @ResponseStatus(HttpStatus.FOUND)
    public List<Product> getProduct(){
        return repo.findAll();
    }

    @GetMapping(value = "{id}")
    @ResponseStatus(HttpStatus.FOUND)
    public Product getPoductById(@PathVariable(value = "id")Long productId){
        return repo.findById(productId).get();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product createRecord(@RequestBody Product product){
        return repo.save(product);
    }

    @PutMapping
    public Product updateProductRecord(@RequestBody Product product) throws ClassNotFoundException{
        if (product == null || product.getColum1() == null) {
            throw new InvalidRequestException("PatientRecord or ID must not be null!");
        }
        Optional<Product> optionalProduct = repo.findById(product.getNo());
        if (optionalProduct.isEmpty()) {
            throw new ClassNotFoundException("Patient with ID " + product.getNo() + " does not exist.");
        }
        Product existingProductRecord = optionalProduct.get();

        existingProductRecord.setNo(product.getNo());
        existingProductRecord.setColum1(product.getColum1());
        existingProductRecord.setColum2(product.getColum2());

        return repo.save(existingProductRecord);
    }

    public void deleteProductById(@PathVariable(value = "Id") Long Id) throws ClassNotFoundException {
        if (repo.findById(Id).isEmpty()){
            throw new ClassNotFoundException("Patient with ID " + Id + " does not exist.");
        }
        repo.deleteById(Id);
    }

    ///----create respond status---------------------------------------------------------------------
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    class InvalidRequestException extends RuntimeException {
        public InvalidRequestException(String s) {
            super(s);
        }
    }
}
