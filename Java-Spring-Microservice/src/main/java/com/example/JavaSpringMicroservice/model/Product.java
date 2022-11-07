package com.example.JavaSpringMicroservice.model;

import lombok.*;

import javax.persistence.*;
@Entity
@Table(name = "test1")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long no;

    @NonNull
    private String colum1;


    private int colum2;

}
