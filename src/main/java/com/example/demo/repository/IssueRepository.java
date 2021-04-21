package com.example.demo.repository;

import com.example.demo.model.ProjectsIssueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<ProjectsIssueEntity, String> {
}