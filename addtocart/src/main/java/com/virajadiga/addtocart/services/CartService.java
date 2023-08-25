package com.virajadiga.addtocart.services;

import com.virajadiga.addtocart.entity.Cart;
import com.virajadiga.addtocart.entity.Product;
import com.virajadiga.addtocart.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.UUID;

@Service
public class CartService {

    @Autowired
    private CartRepository cartRepository;

    @Autowired
    private ProductServiceProxy productServiceProxy;

    public boolean createCartForUser(String userId){
        Cart cart = new Cart();
        cart.setUserId(userId);
        cartRepository.save(cart);
        return true;
    }

    public boolean addProductToCart(String userId, UUID productId){
        Cart cart = cartRepository.findByuserId(userId);
        boolean result = cart.addProductToCart(productId);
        cartRepository.save(cart);
        return result;
    }

    public boolean removeProductFromCart(String userId, UUID productId){
        Cart cart = cartRepository.findByuserId(userId);
        boolean result = cart.removeProductFromCart(productId);
        cartRepository.save(cart);
        return result;
    }

    public ArrayList<Product> getCartProducts(String userId){
        ArrayList<Product> cartProducts = new ArrayList<>();
        Cart cart = cartRepository.findByuserId(userId);
        for (UUID productId: cart.getCartProductIds()) {
            cartProducts.add(productServiceProxy.getProduct(productId));
        }
        return cartProducts;
    }
}
