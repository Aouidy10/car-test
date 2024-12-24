package com.diabcar.care.mapper;

import com.diabcar.care.dao.entities.Car;
import com.diabcar.care.dto.CarDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component

public class CarMapper {


    private final ModelMapper modelMapper;

    public CarMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public CarDTO toCarDTO(Car car) {
        return modelMapper.map(car, CarDTO.class);
    }

    public Car toCarEntity(CarDTO carDTO) {
        return modelMapper.map(carDTO, Car.class);
    }
}