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
    private User user;
}
