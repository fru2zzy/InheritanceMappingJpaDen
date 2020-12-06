package com.example.demo.controller.mappedSuperclass;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.mappedSuperclass.Bus;
import com.example.demo.model.mappedSuperclass.Car;
import com.example.demo.model.mappedSuperclass.Transport;
import com.example.demo.repository.mappedSuperclass.BusRepository;
import com.example.demo.repository.mappedSuperclass.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/transport")
public class TransportController {

    @Autowired
    CarRepository carRepository;

    @Autowired
    BusRepository busRepository;

    @GetMapping
    public List<Transport> getAll() {
        List<Car> cars = carRepository.findAll();
        List<Bus> buses = busRepository.findAll();
        List<Transport> transports = new ArrayList<>();
        transports.addAll(cars);
        transports.addAll(buses);
        return transports;
    }
}