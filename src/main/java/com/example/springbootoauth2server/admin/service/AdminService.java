package com.example.springbootoauth2server.admin.service;

import com.example.springbootoauth2server.OAuth.domain.AccessTokenEntity;
import com.example.springbootoauth2server.OAuth.domain.AuthorizationCodeEntity;
import com.example.springbootoauth2server.OAuth.domain.ClientEntity;
import com.example.springbootoauth2server.OAuth.domain.RefreshTokenEntity;
import com.example.springbootoauth2server.OAuth.repository.AccessTokenRepository;
import com.example.springbootoauth2server.OAuth.repository.AuthorizationCodeRepository;
import com.example.springbootoauth2server.OAuth.repository.ClientRepository;
import com.example.springbootoauth2server.OAuth.repository.RefreshTokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final ClientRepository clientRepository;
    private final AuthorizationCodeRepository authorizationCodeRepository;
    private final AccessTokenRepository accessTokenRepository;
    private final RefreshTokenRepository refreshTokenRepository;

    public Page<ClientEntity> getClients(Pageable pageable) {
        Page<ClientEntity> clients = clientRepository.findAll(pageable);
        return clients;
    }

    public Page<AuthorizationCodeEntity> getAuthorizationCodes(Pageable pageable) {
        return authorizationCodeRepository.findAll(pageable);
    }

    public Page<AccessTokenEntity> getAccessTokens(Pageable pageable) {
        return accessTokenRepository.findAll(pageable);
    }

    public Page<RefreshTokenEntity> getRefreshTokens(Pageable pageable) {
        return refreshTokenRepository.findAll(pageable);
    }
}
