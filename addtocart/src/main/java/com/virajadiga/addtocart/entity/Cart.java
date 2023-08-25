package com.virajadiga.addtocart.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity(name = "cart")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "userId", updatable = false, nullable = false)
    private String userId;
    private Set<UUID> cartProductIds = new HashSet<>();

    public boolean addProductToCart(UUID productId){
        this.cartProductIds.add(productId);
        return true;
    }

    public boolean removeProductFromCart(UUID productId){
        this.cartProductIds.remove(productId);
        return true;
    }
}
