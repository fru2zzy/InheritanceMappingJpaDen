package com.example.demo.repository.tablePerClass;

import com.example.demo.model.tablePerClass.Fruit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FruitRepository extends JpaRepository<Fruit, Integer> {
}
