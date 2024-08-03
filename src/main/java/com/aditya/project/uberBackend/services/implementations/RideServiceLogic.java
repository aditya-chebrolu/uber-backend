package com.aditya.project.uberBackend.services.implementations;

import com.aditya.project.uberBackend.dtos.RideRequestDto;
import com.aditya.project.uberBackend.entities.Driver;
import com.aditya.project.uberBackend.entities.Ride;
import com.aditya.project.uberBackend.entities.enums.RideStatus;
import com.aditya.project.uberBackend.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


@Service
public class RideServiceLogic implements RideService {
    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
