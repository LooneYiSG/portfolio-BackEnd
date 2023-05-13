package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.Model.User;
import com.example.backend.Model.UserDTO;
import com.example.backend.repository.UserRepository;

@Service
public class UserService implements IUserService{

    @Autowired
    public UserRepository userRepository;

    @Override
    public List<User> getUserList() {
        return userRepository.findAll();
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User searchUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public UserDTO login(String email, String password){
        User usuario = userRepository.findByEmailAndPassword(email, password);
        UserDTO userDTO = new UserDTO(usuario.getId(), usuario.getNombre(), usuario.getApellido(), usuario.getSobre_mi(), usuario.getFoto());
        return userDTO;
    }
    
}
