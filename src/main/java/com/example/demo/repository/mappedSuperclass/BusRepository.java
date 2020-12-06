package com.example.demo.repository.mappedSuperclass;

import com.example.demo.model.mappedSuperclass.Bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BusRepository extends JpaRepository<Bus, Integer> {
}
