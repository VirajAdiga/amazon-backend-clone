package com.virajadiga.addtocart.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "cart")
@Getter
@Setter
@NoArgsConstructor
public class Cart {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "userId", updatable = false, nullable = false)
    private String userId;

    private Set<Product> cartProducts;

    public Cart(Long id, String userId){
        this.id = id;
        this.userId = userId;
        this.cartProducts = new HashSet<>();
    }

    public boolean addProductToCart(Product product){
        this.cartProducts.add(product);
        return true;
    }

    public boolean removeProductFromCart(Product product){
        this.cartProducts.remove(product);
        return true;
    }
}
