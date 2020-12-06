package com.example.demo.repository.mappedSuperclass;

import com.example.demo.model.mappedSuperclass.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {
}
