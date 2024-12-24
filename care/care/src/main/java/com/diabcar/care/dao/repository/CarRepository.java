package com.diabcar.care.dao.repository;

import com.diabcar.care.dao.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    // Custom finder
    List<Car> findByModel(String model);
}