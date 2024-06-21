package com.example.demo.web.security.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/**
 * Mock user class
 */
public class CustomOAuth2User implements OAuth2User {
    @Override
    public Map<String, Object> getAttributes() {
        return Map.of("email","test");
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("TEST"));
    }

    @Override
    public String getName() {
        return "testName";
    }
}
