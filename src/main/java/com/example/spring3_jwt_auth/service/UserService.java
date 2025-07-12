package com.example.spring3_jwt_auth.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.spring3_jwt_auth.models.User;
import com.example.spring3_jwt_auth.repositories.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
    
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }
    
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}
