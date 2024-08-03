package com.aditya.project.uberBackend.dtos;
import com.aditya.project.uberBackend.entities.enums.PaymentMethod;
import com.aditya.project.uberBackend.entities.enums.RideStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto {
    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private RiderDto rider;
    private DriverDto driver;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private Double fare;
    private LocalDateTime requestedTime;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
