package com.url.shortner.security.jwt;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class JwtAuthenticationResponse {
    private String token;

    // No-args constructor (needed for Spring)
    public JwtAuthenticationResponse() {
    }

    // Constructor with token argument
    public JwtAuthenticationResponse(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
