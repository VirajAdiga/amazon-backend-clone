package com.virajadiga.addtocart.controllers;

import com.virajadiga.addtocart.entity.Product;
import com.virajadiga.addtocart.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.UUID;

@RestController
@RequestMapping("/{userId}/cart/")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping("")
    public boolean createCartForUser(@PathVariable String userId){
        return cartService.createCartForUser(userId);
    }

    @GetMapping("")
    public ArrayList<Product> getCartProducts(@PathVariable String userId){
        return cartService.getCartProducts(userId);
    }

    @PostMapping("{productId}/")
    public boolean addProductToCart(@PathVariable String userId, @PathVariable UUID productId){
        return cartService.addProductToCart(userId, productId);
    }

    @DeleteMapping("{productId}/")
    public boolean removeProductFromCart(@PathVariable String userId, @PathVariable UUID productId){
        return cartService.removeProductFromCart(userId, productId);
    }
}
