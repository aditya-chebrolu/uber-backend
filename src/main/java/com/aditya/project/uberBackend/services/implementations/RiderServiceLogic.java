package com.aditya.project.uberBackend.services.implementations;

import com.aditya.project.uberBackend.dtos.DriverDto;
import com.aditya.project.uberBackend.dtos.RideDto;
import com.aditya.project.uberBackend.dtos.RideRequestDto;
import com.aditya.project.uberBackend.dtos.RiderDto;
import com.aditya.project.uberBackend.services.RiderService;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RiderServiceLogic implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllRides() {
        return List.of();
    }
}
