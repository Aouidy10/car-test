package com.diabcar.care.service;

import com.diabcar.care.dto.CarDTO;
import java.util.List;

public interface CarService {


    CarDTO saveCar(CarDTO carDTO);


    List<CarDTO> findCarsByModel(String model);


    List<CarDTO> findAllCars();
}
