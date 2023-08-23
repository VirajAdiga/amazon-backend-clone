package com.virajadiga.users.controllers;

import com.virajadiga.users.entity.User;
import com.virajadiga.users.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping("{userId}/")
    public User getUser(@PathVariable String userId){
        return userService.getUser(userId);
    }
}
