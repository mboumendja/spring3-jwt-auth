package com.example.spring3_jwt_auth.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix = "jwt")
public class JwtConfig {
    private String issuer = "jwt-auth-app";
    private long expiration = 3600000; // 1 hour in milliseconds
    private long refreshExpiration = 86400000; // 24 hours in milliseconds
}
