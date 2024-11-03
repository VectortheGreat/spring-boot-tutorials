package com.kadir.service.impl;

import java.util.Date;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kadir.jwt.AuthResponse;
import com.kadir.jwt.JwtService;
import com.kadir.jwt.RefreshTokenRequest;
import com.kadir.model.RefreshToken;
import com.kadir.model.User;
import com.kadir.repository.RefreshTokenRepository;
import com.kadir.service.IRefreshTokenService;

@Service
public class RefreshTokenServiceImpl implements IRefreshTokenService {

    @Autowired
    private RefreshTokenRepository refreshTokenRepository;

    public boolean isRefreshTokenExpired(Date expireDate) {
        return new Date().before(expireDate);
    }

    @Autowired
    private JwtService jwtService;

    private RefreshToken createRefreshToken(User user) {
        RefreshToken refreshToken = new RefreshToken();
        refreshToken.setRefreshToken(UUID.randomUUID().toString());
        refreshToken.setExpireDate(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 4));
        refreshToken.setUser(user);

        return refreshToken;
    }

    @Override
    public AuthResponse refreshToken(RefreshTokenRequest request) {
        Optional<RefreshToken> optional = refreshTokenRepository.findByRefreshToken(request.getRefreshToken());
        if (optional.isEmpty()) {
            System.out.println("Refresh token not found");
        }
        RefreshToken refreshToken = optional.get();
        if (!isRefreshTokenExpired(refreshToken.getExpireDate())) {
            System.out.println("Refresh token is expired");
        }
        String accessToken = jwtService.generateToken(refreshToken.getUser());
        RefreshToken savedRefreshToken = refreshTokenRepository.save(createRefreshToken(refreshToken.getUser()));

        return new AuthResponse(accessToken, savedRefreshToken.getRefreshToken());
    }

}
