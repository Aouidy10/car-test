package com.diabcar.care.web;

import com.diabcar.care.dto.CarDTO;
import com.diabcar.care.service.CarService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class CarGraphQLController {

    private final CarService carService;

    public CarGraphQLController(CarService carService) {
        this.carService = carService;
    }

    @QueryMapping
    public List<CarDTO> getAllCars() {
        return carService.findAllCars();
    }

    @QueryMapping
    public List<CarDTO> getCarByModel(@Argument String model) {
        return carService.findCarsByModel(model);
    }

    @MutationMapping
    public CarDTO saveCar(@Argument CarDTO car) {
        return carService.saveCar(car);
    }
}