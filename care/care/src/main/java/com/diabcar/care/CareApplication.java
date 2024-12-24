package com.diabcar.care;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.diabcar.care.dto.CarDTO;
import com.diabcar.care.service.CarService;

@SpringBootApplication
public class CareApplication {

    public static void main(String[] args) {
        SpringApplication.run(CareApplication.class, args);
    }

    /**
     * Inserts sample Car data into the database
     * when the application starts.
     */
    @Bean
    CommandLineRunner start(CarService carService) {
        return args -> {
            // Add as many Cars as you wish
            carService.saveCar(new CarDTO("Renault Clio", "Red", "REN-123", 8000.0));
            carService.saveCar(new CarDTO("Ford Fiesta", "Blue", "FRD-456", 9000.0));
            carService.saveCar(new CarDTO("Peugeot 208", "Grey", "PGT-789", 10000.0));
            carService.saveCar(new CarDTO("Ferrari F8", "Red", "FER-999", 250000.0));
        };
    }
}
