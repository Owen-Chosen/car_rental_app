package com.rencia.car_rental_app.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "vehicles")
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicle_id;

    @Column(length = 50, nullable = false)
    private String vehicle_model;

    @Column(length = 10, nullable = false)
    private String vehicle_number;

    @Column(length = 10)
    private VehicleSubCategory vehicleSubCategory;

    @Column(nullable = false, length = 50)
    private String color;

    @Column(nullable = false, length = 10)
    private Location location;

    @Column(nullable = false, length = 10)
    private FuelType fuelType;

    @Column(nullable = false, length = 1)
    private int availability_status;

    @Column(nullable = false, length = 500)
    private String vehicle_image_url;



}
