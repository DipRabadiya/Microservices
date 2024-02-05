package com.apigateway.apigateway.models.AuthResponse;

import lombok.*;

import java.util.Collection;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class AuthResponse {
    private  String userId;
    private String accessToken;
    private  String refreshToken;
    private long expireAt;
    private Collection<String> authorities;
}
