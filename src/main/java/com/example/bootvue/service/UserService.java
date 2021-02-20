package com.example.bootvue.service;

import com.example.bootvue.entity.User;

import java.util.List;

public interface UserService {
    void save(User user);
    void update(User user);
    void delete(String id);
    List<User> findAll();
    User findById(String id);
}
