package com.example.demo;

import java.util.Collection;

import com.example.demo.model.ProjectsEpicEntity;
import com.example.demo.model.ProjectsIssueEntity;
import com.example.demo.repository.EpicRepository;
import com.example.demo.repository.IssueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@AllArgsConstructor
public class MyService {
    EpicRepository epicRepository;
    IssueRepository issueRepository;

    public ProjectsEpicEntity saveEpic(ProjectsEpicEntity projectsEpicEntity) {
        ProjectsEpicEntity savedEpic = epicRepository.saveAndFlush(projectsEpicEntity);
        return savedEpic;
    }

    public ProjectsIssueEntity saveIssue(ProjectsIssueEntity projectsIssueEntity) {
        return issueRepository.saveAndFlush(projectsIssueEntity);
    }

    public ProjectsEpicEntity getEpicById(String epicId) {
        return epicRepository.findById(epicId).get();
    }

    @Transactional(readOnly = true)
    public long countAllIssuesTransactional() {
        return countAllIssues();
    }

    public long countAllIssuesNonTransactional() {
        return countAllIssues();
    }

    private long countAllIssues() {
        return epicRepository.findAll()
                             .stream()
                             .map(ProjectsEpicEntity::getIssues)
                             .mapToLong(Collection::size)
                             .sum();
    }
}
