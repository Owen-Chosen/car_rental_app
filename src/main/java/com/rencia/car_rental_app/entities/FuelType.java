package com.rencia.car_rental_app.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "city")
public class FuelType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long fuel_type_id;

    @Column(nullable = false, unique = true, length = 50)
    private String fuel_type;
}
