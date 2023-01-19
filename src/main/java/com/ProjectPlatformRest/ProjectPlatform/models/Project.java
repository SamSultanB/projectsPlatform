package com.ProjectPlatformRest.ProjectPlatform.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashSet;

@Entity
@Table(name = "projects")
@Getter
@Setter
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "projectName")
    private String projectName;
    @Column(name = "description")
    private String description;
    @Column(name = "publishedDate")
    private LocalDate publishedDate;
    @Column(name = "deadline")
    private LocalDateTime deadline;

    public Project(){

    }

    public Project(String projectName, String description, LocalDate publishedDate, LocalDateTime deadline) {
        this.projectName = projectName;
        this.description = description;
        this.publishedDate = publishedDate;
        this.deadline = deadline;
    }

}
