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
@Table(name = "vehicle_category")
public class VehicleCategory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long vehicle_category_id;

    @Column(unique = true, nullable = false, length = 50)
    private String vehicle_category_name;
}
