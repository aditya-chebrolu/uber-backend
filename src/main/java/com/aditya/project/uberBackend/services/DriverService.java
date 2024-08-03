package com.aditya.project.uberBackend.services;

import com.aditya.project.uberBackend.dtos.DriverDto;
import com.aditya.project.uberBackend.dtos.RideDto;
import com.aditya.project.uberBackend.dtos.RiderDto;

import java.util.List;

public interface DriverService {

    RideDto acceptRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getAllRides();

}
