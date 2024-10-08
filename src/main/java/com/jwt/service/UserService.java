package com.jwt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.model.User;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Prasad", "prasad@gmail.com", "password1"));
        store.add(new User(UUID.randomUUID().toString(), "Tara", "tara@gmail.com", "password2"));
        store.add(new User(UUID.randomUUID().toString(), "Jena", "jena@gmail.com", "password3"));
        store.add(new User(UUID.randomUUID().toString(), "TaraPrasad", "taraprasad@gmail.com", "password4"));
    }

    public List<User> getUsers() {
        return this.store;
    }
}

