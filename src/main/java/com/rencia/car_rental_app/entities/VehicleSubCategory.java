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
@Table(name = "vehicle_subcategory")
public class VehicleSubCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicle_subcategory_id;

    @Column(nullable = false, unique = true)
    private String vehicle_subcategory_name;

    @Column(nullable = false)
    private Double price_per_day;

    @Column(nullable = false)
    private VehicleCategory vehicleCategory;

}
