package com.example.demo.repository;

import com.example.demo.model.ProjectsEpicEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpicRepository extends JpaRepository<ProjectsEpicEntity, String> {
}