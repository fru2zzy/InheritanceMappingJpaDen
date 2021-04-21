package com.example.demo.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
@Table(name = "projects_epic")
public class ProjectsEpicEntity {
    @Id
    @Column(name = "epic_id")
    private String id;

    @OneToMany(mappedBy = "epic", cascade = CascadeType.ALL)
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinTable(
//            name = "projects_epic_issue",
//            joinColumns = @JoinColumn(name = "epic_id"),
//            inverseJoinColumns = @JoinColumn(name = "issue_id")
//    )
    private Set<ProjectsIssueEntity> issues = new HashSet<>();
}