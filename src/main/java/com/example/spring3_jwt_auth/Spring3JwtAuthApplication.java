package com.example.spring3_jwt_auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.spring3_jwt_auth.config.RsaKeyProperties;

@SpringBootApplication
@EnableConfigurationProperties(RsaKeyProperties.class)
public class Spring3JwtAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(Spring3JwtAuthApplication.class, args);
	}

}
