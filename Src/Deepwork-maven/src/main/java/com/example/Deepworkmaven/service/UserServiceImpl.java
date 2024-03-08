package com.example.Deepworkmaven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Deepworkmaven.controller.UserSignupService;
import com.example.Deepworkmaven.dto.UserDto;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserSignupService userSignupService;

    @Override
    public void signup(UserDto userDto) {
        userSignupService.signup(userDto);
    }
}

