package com.virajadiga.users.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Component
@FeignClient(name = "cart-service", url = "localhost:8083")
public interface CartServiceProxy {

    @PostMapping("/{userId}/cart/")
    boolean createCartForUser(@PathVariable String userId);
}
