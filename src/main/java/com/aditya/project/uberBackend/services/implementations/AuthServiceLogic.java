package com.aditya.project.uberBackend.services.implementations;

import com.aditya.project.uberBackend.dtos.DriverDto;
import com.aditya.project.uberBackend.dtos.SignupDto;
import com.aditya.project.uberBackend.dtos.UserDto;
import com.aditya.project.uberBackend.services.AuthService;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceLogic implements AuthService {
    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignupDto signupDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
