package com.aditya.project.uberBackend.services;

import com.aditya.project.uberBackend.dtos.DriverDto;
import com.aditya.project.uberBackend.dtos.SignupDto;
import com.aditya.project.uberBackend.dtos.UserDto;
import org.locationtech.jts.geom.Point;


public interface AuthService {

    String login(String email,String password);

    UserDto signup(SignupDto signupDto);

    DriverDto onboardNewDriver(Long userId);

}
