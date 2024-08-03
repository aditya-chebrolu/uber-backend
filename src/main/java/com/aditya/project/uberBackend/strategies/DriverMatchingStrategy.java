package com.aditya.project.uberBackend.strategies;

import com.aditya.project.uberBackend.dtos.RideRequestDto;
import com.aditya.project.uberBackend.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);

}
