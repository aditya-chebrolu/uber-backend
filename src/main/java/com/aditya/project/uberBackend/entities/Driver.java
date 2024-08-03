package com.aditya.project.uberBackend.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.locationtech.jts.geom.Point;

@Entity
@Getter
@Setter
public class Driver {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name="user_id")
    private User user;

    private Double Rating;
    private Boolean available;

    @Column(columnDefinition = "Geometry(Point,4326)")
    Point currentLocation;
}
