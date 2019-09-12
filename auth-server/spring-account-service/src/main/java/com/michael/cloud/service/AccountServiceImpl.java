package com.michael.cloud.service;


import org.springframework.stereotype.Service;

import com.michael.cloud.client.AuthServiceFeignClient;
import com.michael.cloud.dto.UserDto;
import com.michael.cloud.dto.UserRegistrationDto;

@Service
public class AccountServiceImpl implements AccountService {

    private final AuthServiceFeignClient authServiceFeignClient;

    public AccountServiceImpl(AuthServiceFeignClient authServiceFeignClient) {
        this.authServiceFeignClient = authServiceFeignClient;
    }

    @Override
    public UserDto create(UserRegistrationDto user) {
        return authServiceFeignClient.createUser(user);
    }
}
