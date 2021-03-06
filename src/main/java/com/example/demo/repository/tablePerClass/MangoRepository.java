package com.example.demo.repository.tablePerClass;

import com.example.demo.model.tablePerClass.Mango;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MangoRepository extends JpaRepository<Mango, Integer> {
}
