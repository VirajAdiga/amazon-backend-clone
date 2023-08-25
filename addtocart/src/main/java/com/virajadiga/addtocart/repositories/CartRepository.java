package com.virajadiga.addtocart.repositories;

import com.virajadiga.addtocart.entity.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
    Cart findByuserId(String userId);
}
