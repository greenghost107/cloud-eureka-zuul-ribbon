package com.michael.cloud.service;






import com.michael.cloud.dto.UserDto;
import com.michael.cloud.dto.UserRegistrationDto;


public interface AccountService {

    /**
     * Invokes Auth Service user creation
     *
     * @param user
     * @return created account
     */
    UserDto create(UserRegistrationDto user);
}
