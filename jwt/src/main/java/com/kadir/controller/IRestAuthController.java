package com.kadir.controller;

import com.kadir.dto.DtoUser;
import com.kadir.jwt.AuthRequest;
import com.kadir.jwt.AuthResponse;
import com.kadir.jwt.RefreshTokenRequest;

public interface IRestAuthController {

    public DtoUser register(AuthRequest request);

    public AuthResponse authenticate(AuthRequest request);

    public AuthResponse refreshToken(RefreshTokenRequest refreshToken);

}
