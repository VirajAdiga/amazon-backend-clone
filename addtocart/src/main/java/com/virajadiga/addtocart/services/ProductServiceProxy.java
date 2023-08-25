package com.virajadiga.addtocart.services;

import com.virajadiga.addtocart.entity.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.UUID;

@Component
@FeignClient(name = "product-service", url = "localhost:8082", path = "/products/")
public interface ProductServiceProxy {

    @GetMapping("{productId}/")
    Product getProduct(@PathVariable UUID productId);
}
