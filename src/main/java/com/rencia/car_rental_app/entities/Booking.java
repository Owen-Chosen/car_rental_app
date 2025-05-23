package com.rencia.car_rental_app.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "booking")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long booking_id;

    @NotNull
    private Date pickup_date;

    @NotNull
    private Date dropoff_date;

    @NotNull
    private Date booking_date;

    @NotNull
    private Double amount;

    @NotNull
    private Location location;

    @NotNull
    private Vehicle vehicle;

    @NotNull
    private User user;
}
