package com.virajadiga.products.controllers;

import com.virajadiga.products.entity.Product;
import com.virajadiga.products.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("/products/")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("")
    public Product addProduct(@RequestBody Product product){
        return productService.addProduct(product);
    }

    @GetMapping("")
    public ArrayList<Product> getProducts(){
        return productService.getProducts();
    }

    @GetMapping("{productId}/")
    public Product getProduct(@PathVariable UUID productId){
        return productService.getProduct(productId);
    }
}
