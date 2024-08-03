package com.aditya.project.uberBackend.strategies.implementation;

import com.aditya.project.uberBackend.dtos.RideRequestDto;
import com.aditya.project.uberBackend.entities.Driver;
import com.aditya.project.uberBackend.strategies.DriverMatchingStrategy;

import java.util.List;

public class DriverMatchingNearestDriverStrategy implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
