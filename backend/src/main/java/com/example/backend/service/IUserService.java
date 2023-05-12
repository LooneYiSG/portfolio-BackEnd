package com.example.backend.service;

import java.util.List;

import com.example.backend.Model.User;
import com.example.backend.Model.UserDTO;

public interface IUserService {

    public List<User> getUserList();

    public User saveUser(User user);

    public void deleteUser(Long id);
    
    public User searchUser(Long id);

    public UserDTO login(String email, String password);

}
