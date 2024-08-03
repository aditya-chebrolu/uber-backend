package com.aditya.project.uberBackend.repositories;

import com.aditya.project.uberBackend.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RideRepository extends JpaRepository<Ride,Long> {
}
