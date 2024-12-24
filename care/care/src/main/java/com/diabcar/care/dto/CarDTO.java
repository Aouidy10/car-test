package com.diabcar.care.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarDTO {

    private String model;
    private String color;
    private String matricul;
    private double price;
}
