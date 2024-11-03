package com.kadir.controller.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kadir.controller.IRestAuthController;
import com.kadir.dto.DtoUser;
import com.kadir.jwt.AuthRequest;
import com.kadir.jwt.AuthResponse;
import com.kadir.jwt.RefreshTokenRequest;
import com.kadir.service.IAuthService;
import com.kadir.service.IRefreshTokenService;

import jakarta.validation.Valid;

@RestController
public class RestAuthControllerImpl implements IRestAuthController {
    @Autowired
    private IAuthService authService;

    @Autowired
    private IRefreshTokenService refreshTokenService;

    @PostMapping("/register")
    @Override
    public DtoUser register(@Valid @RequestBody AuthRequest request) {
        return authService.register(request);
    }

    @PostMapping("/authenticate")
    @Override
    public AuthResponse authenticate(@Valid @RequestBody AuthRequest request) {
        return authService.authenticate(request);
    }

    @PostMapping("/refresh-token")
    @Override
    public AuthResponse refreshToken(@RequestBody RefreshTokenRequest refreshToken) {
        return refreshTokenService.refreshToken(refreshToken);
    }

}
