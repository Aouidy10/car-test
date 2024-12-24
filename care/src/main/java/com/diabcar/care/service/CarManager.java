package com.diabcar.care.service;

import com.diabcar.care.dao.entities.Car;                  // entity class
import com.diabcar.care.dao.repository.CarRepository;
import com.diabcar.care.dto.CarDTO;
import com.diabcar.care.mapper.CarMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarManager implements CarService {

    private final CarRepository carRepository;
    private final CarMapper carMapper;

    public CarManager(CarRepository carRepository, CarMapper carMapper) {
        this.carRepository = carRepository;
        this.carMapper = carMapper;
    }


    @Override
    public CarDTO saveCar(CarDTO carDTO) {
        Car carEntity = carMapper.toCarEntity(carDTO);
        Car savedCar = carRepository.save(carEntity);
        return carMapper.toCarDTO(savedCar);
    }


    @Override
    public List<CarDTO> findCarsByModel(String model) {
        List<Car> cars = carRepository.findByModel(model);
        return cars.stream()
                .map(carMapper::toCarDTO)
                .collect(Collectors.toList());
    }


    @Override
    public List<CarDTO> findAllCars() {
        List<Car> allCars = carRepository.findAll();
        return allCars.stream()
                .map(carMapper::toCarDTO)
                .collect(Collectors.toList());
    }
}
