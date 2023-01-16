package com.ProjectPlatformRest.ProjectPlatform.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;

@Entity
@Table(name = "Projects")
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
    private User user;

    public Project(){

    }

    public Project(String projectName, String description) {
        this.projectName = projectName;
        this.description = description;
    }

}
