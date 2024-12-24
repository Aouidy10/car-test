package com.diabcar.care.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data               // Lombok: generates getters, setters, toString, etc.
@NoArgsConstructor  // Lombok: generates a no-argument constructor
@AllArgsConstructor // Lombok: generates an all-argument constructor
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCar;

    private String model;
    private String color;
    private String matricul;
    private double price;
}