package com.example.demo.controller.mappedSuperclass;

import java.util.List;

import com.example.demo.model.mappedSuperclass.Car;
import com.example.demo.repository.mappedSuperclass.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/car")
public class CarController {

    @Autowired
    CarRepository carRepository;

    @GetMapping
    public List<Car> getAll() {
        return carRepository.findAll();
    }

    @PostMapping
    public Car post(@RequestBody Car car) {
        return carRepository.save(car);
    }
}
