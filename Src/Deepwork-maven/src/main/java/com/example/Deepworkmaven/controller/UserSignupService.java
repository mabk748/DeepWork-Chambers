package com.example.Deepworkmaven.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Deepworkmaven.dto.UserDto;
import com.example.Deepworkmaven.entity.User;
import com.example.Deepworkmaven.repository.UserRepository;;
@Service
public class UserSignupService {
    @Autowired
    private UserRepository userRepository;

    public void signup(UserDto userDto) {
        // Logique de signup
        if (userDto.getUsername() == null || userDto.getEmail() == null || userDto.getPassword()== null) {
            throw new IllegalArgumentException("Les données du formulaire de signup ne sont pas valides");
        }
        User user = new User();
        user.setId(userDto.getId());
        user.setUsername(userDto.getUsername());
        user.setEmail(userDto.getEmail());
        user.setPassword(userDto.getPassword());
        userRepository.save(user);
    }
}
