package com.example.spring3_jwt_auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring3_jwt_auth.dto.LoginRequest;
import com.example.spring3_jwt_auth.dto.LoginResponse;
import com.example.spring3_jwt_auth.dto.RegisterRequest;
import com.example.spring3_jwt_auth.models.User;
import com.example.spring3_jwt_auth.service.AuthService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@Valid @RequestBody LoginRequest request) {
        LoginResponse response = authService.login(request);
        return ResponseEntity.ok(response);
    }
    
    @PostMapping("/register")
    public ResponseEntity<String> register(@Valid @RequestBody RegisterRequest request) {
        User user = authService.register(request);
        return ResponseEntity.ok("User registered successfully with username: " + user.getUsername());
    }
}
