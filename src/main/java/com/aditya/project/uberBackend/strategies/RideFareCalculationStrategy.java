package com.aditya.project.uberBackend.strategies;

import com.aditya.project.uberBackend.dtos.RideRequestDto;

public interface RideFareCalculationStrategy {

    double calculateFare(RideRequestDto rideRequestDto);

}
