package com.michael.cloud.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.michael.cloud.dto.UserDto;
import com.michael.cloud.dto.UserRegistrationDto;
import com.michael.cloud.service.AccountService;

@RestController
public class AccountController {
	
	private final AccountService accountService;
	
	public AccountController(AccountService accountService) {
		this.accountService = accountService;
	}
	
	@PostMapping
	public UserDto createNewAccount(@RequestBody UserRegistrationDto user) {
		return accountService.create(user);
	}
	
}
