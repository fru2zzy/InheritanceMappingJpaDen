package com.example.demo.controller;

import java.util.Set;
import java.util.UUID;

import com.example.demo.MyService;
import com.example.demo.model.ProjectsEpicEntity;
import com.example.demo.model.ProjectsIssueEntity;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Controller {

    MyService service;

    @GetMapping
    public void saveEpic() {
        ProjectsEpicEntity epicEntity = new ProjectsEpicEntity();
        epicEntity.setId(UUID.randomUUID().toString());

        //service.saveEpic(epicEntity);

        ProjectsIssueEntity issueEntity = new ProjectsIssueEntity();
        issueEntity.setId("55");
        issueEntity.setEpic(epicEntity);
        service.saveIssue(issueEntity);

        issueEntity.setId("56");
        epicEntity.setId("77");
        epicEntity.setIssues(Set.of(issueEntity));
        ProjectsEpicEntity savedEpicEntity = service.saveEpic(epicEntity);
        System.out.println(savedEpicEntity);
    }

}
