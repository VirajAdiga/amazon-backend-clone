package com.virajadiga.products.repositories;

import com.virajadiga.products.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.UUID;

@Repository
public interface ProductRepository extends MongoRepository<Product, BigInteger> {
    Product findByproductID(UUID productId);
}
