package com.example.demo.repository.tablePerClass;

import com.example.demo.model.tablePerClass.Orange;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrangeRepository extends JpaRepository<Orange, Integer> {
}
