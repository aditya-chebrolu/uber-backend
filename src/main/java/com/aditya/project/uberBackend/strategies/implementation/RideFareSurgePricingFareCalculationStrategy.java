package com.aditya.project.uberBackend.strategies.implementation;

import com.aditya.project.uberBackend.dtos.RideRequestDto;
import com.aditya.project.uberBackend.strategies.RideFareCalculationStrategy;

public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
