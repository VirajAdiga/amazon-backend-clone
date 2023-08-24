package com.virajadiga.products.services;

import com.virajadiga.products.entity.Product;
import com.virajadiga.products.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(Product product){
        product.setProductID(UUID.randomUUID());
        return productRepository.save(product);
    }

    public ArrayList<Product> getProducts(){
        return (ArrayList<Product>) productRepository.findAll();
    }

    public Product getProduct(UUID productId){
        return productRepository.findByproductID(productId);
    }
}
