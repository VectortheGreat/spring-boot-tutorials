package com.kadir.service;

import com.kadir.dto.DtoUser;
import com.kadir.jwt.AuthRequest;
import com.kadir.jwt.AuthResponse;

public interface IAuthService {

    public DtoUser register(AuthRequest user);

    public AuthResponse authenticate(AuthRequest request);

}
