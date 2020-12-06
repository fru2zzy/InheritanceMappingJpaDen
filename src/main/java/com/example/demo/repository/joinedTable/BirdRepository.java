package com.example.demo.repository.joinedTable;

import com.example.demo.model.joinedTable.Bird;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BirdRepository extends JpaRepository<Bird, Integer> {
}