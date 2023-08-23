package com.virajadiga.users.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String uniqueId;
    private String email;

    public User() {}

    public User(Long id, String name, String uniqueId, String email) {
        this.id = id;
        this.name = name;
        this.uniqueId = uniqueId;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
