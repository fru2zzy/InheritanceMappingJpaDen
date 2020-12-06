package com.example.demo.repository.singleTable;

import com.example.demo.model.singleTable.Pen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenRepository extends JpaRepository<Pen, Integer> {
}
