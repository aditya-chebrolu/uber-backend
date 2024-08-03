package com.aditya.project.uberBackend.services;

import com.aditya.project.uberBackend.dtos.RideRequestDto;
import com.aditya.project.uberBackend.entities.Driver;
import com.aditya.project.uberBackend.entities.Ride;
import com.aditya.project.uberBackend.entities.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {

    Ride getRideById(Long rideId);

    void matchWithDrivers(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(Long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);
}
