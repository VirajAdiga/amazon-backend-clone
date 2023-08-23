package com.virajadiga.users.services;

import com.virajadiga.users.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public User addUser(User user){
        return user;
    }

    public User getUser(String userId){
        return new User();
    }
}
