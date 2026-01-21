package com.example.biteflow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                //allow all requests for development
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll()

                )
                //disable csrf
                .csrf(csrf -> csrf.disable());
        return http.build();
    }
}
