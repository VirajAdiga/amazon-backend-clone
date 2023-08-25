package com.virajadiga.users.services;

import com.virajadiga.users.entity.User;
import com.virajadiga.users.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public User getUser(String uniqueId){
        return userRepository.findByuniqueId(uniqueId);
    }
}
