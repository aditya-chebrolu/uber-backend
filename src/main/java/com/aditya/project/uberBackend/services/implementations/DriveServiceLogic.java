package com.aditya.project.uberBackend.services.implementations;

import com.aditya.project.uberBackend.dtos.DriverDto;
import com.aditya.project.uberBackend.dtos.RideDto;
import com.aditya.project.uberBackend.dtos.RiderDto;
import com.aditya.project.uberBackend.services.DriverService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class DriveServiceLogic implements DriverService {
    @Override
    public RideDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllRides() {
        return List.of();
    }
}
