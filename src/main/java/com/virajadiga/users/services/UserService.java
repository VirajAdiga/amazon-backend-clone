package com.virajadiga.users.services;

import com.virajadiga.users.entity.User;
import com.virajadiga.users.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public Optional<User> getUser(Long userId){
        return userRepository.findById(userId);
    }
}
