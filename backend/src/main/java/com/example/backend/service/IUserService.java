package com.example.backend.service;

import java.util.List;

import com.example.backend.Model.User;

public interface IUserService {

    public List<User> getUserList();

    public void saveUser(User user);

    public void deleteUser(Long id);
    
    public User searchUser(Long id);

}
