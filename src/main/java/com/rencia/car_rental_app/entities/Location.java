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
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long location_id;

    @Column(nullable = false, length = 50)
    private String location_name;

    @Column(nullable = false, length = 100)
    private String address;

    @Column(nullable = false)
    private City city;

    @Column(nullable = false)
    private String pin_code;
}
