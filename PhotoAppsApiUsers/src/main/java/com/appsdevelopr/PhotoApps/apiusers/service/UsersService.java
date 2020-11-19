package com.appsdevelopr.PhotoApps.apiusers.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.appsdevelopr.PhotoApps.apiusers.shared.UserDto;

public interface UsersService extends UserDetailsService{
	UserDto createUser(UserDto userDetails);
	UserDto getUserDetailsByEmail(String email);
	UserDto getUserByUserId(String userId);
}
