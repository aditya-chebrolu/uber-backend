package com.aditya.project.uberBackend.dtos;

import com.aditya.project.uberBackend.entities.enums.PaymentMethod;
import com.aditya.project.uberBackend.entities.enums.RideRequestStatus;
import jakarta.persistence.*;
import lombok.*;
import org.locationtech.jts.geom.Point;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RideRequestDto {
    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private LocalDateTime requestedTime;
    private RiderDto rider;
    private PaymentMethod paymentMethod;
    private RideRequestStatus rideRequestStatus;
}
