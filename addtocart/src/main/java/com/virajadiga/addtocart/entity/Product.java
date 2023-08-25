package com.virajadiga.addtocart.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.UUID;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private BigInteger id;
    private UUID productID;
    private String name;
    private double price;
    private double rating;
    private String imageURL;
}
