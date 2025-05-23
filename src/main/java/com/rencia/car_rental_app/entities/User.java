package com.rencia.car_rental_app.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long user_id;

    @Column(nullable = false, length = 50)
    private String first_name;

    @Column(length = 50)
    private String last_name;

    @JsonIgnore
    @Column(nullable = false, length = 50)
    @Size(min = 5)
    private String password;

    @Column(nullable = false, unique = true, length = 50)
    private String email;

    @Column(nullable = false, unique = true)
    private String mobile_no;

    @Column(nullable = false, length = 10)
    @ManyToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    private Role role_id;

    @Size(min = 2, max = 10)
    @Value("10000.00")
    private Double wallet_money;

}
