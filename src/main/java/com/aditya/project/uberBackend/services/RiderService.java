package com.aditya.project.uberBackend.services;

import com.aditya.project.uberBackend.dtos.DriverDto;
import com.aditya.project.uberBackend.dtos.RideDto;
import com.aditya.project.uberBackend.dtos.RideRequestDto;
import com.aditya.project.uberBackend.dtos.RiderDto;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllRides();
}
