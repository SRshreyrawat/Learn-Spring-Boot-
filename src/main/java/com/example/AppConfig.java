package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.Beans.Apple;

@Configuration
public class AppConfig {
    @Bean
    public Apple getApple() {
        return new Apple();
    }
}
