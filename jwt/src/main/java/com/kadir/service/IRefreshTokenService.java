package com.kadir.service;

import com.kadir.jwt.AuthResponse;
import com.kadir.jwt.RefreshTokenRequest;

public interface IRefreshTokenService {

    public AuthResponse refreshToken(RefreshTokenRequest refreshToken);
}
