package com.virajadiga.users.controllers;

import com.virajadiga.users.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users/")
public class UserController {

    @PostMapping("")
    public User addUser(@RequestBody User user){
        return new User();
    }

    @GetMapping("{userId}/")
    public User getUser(@PathVariable String userId){
        return new User();
    }
}
