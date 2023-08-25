package com.virajadiga.users.services;

import com.virajadiga.users.entity.User;
import com.virajadiga.users.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CartServiceProxy cartServiceProxy;

    public User addUser(User user){
        User savedUser = userRepository.save(user);
        cartServiceProxy.createCartForUser(savedUser.getUniqueId());
        return savedUser;
    }

    public User getUser(String uniqueId){
        return userRepository.findByuniqueId(uniqueId);
    }
}
