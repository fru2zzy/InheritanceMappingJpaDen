package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "projects_issue")
public class ProjectsIssueEntity {
    @Id
    @Column(name = "issue_id")
    private String id;

    @ManyToOne(fetch = FetchType.LAZY, cascade = {CascadeType.ALL})
    @JoinColumn(name = "epic_id")
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    private ProjectsEpicEntity epic;
}