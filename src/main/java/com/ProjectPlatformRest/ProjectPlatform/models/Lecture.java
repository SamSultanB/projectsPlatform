package com.ProjectPlatformRest.ProjectPlatform.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;

@Entity
@Table(name = "Lectures")
@Getter
@Setter
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "lectureName")
    private String lectureName;
    @Column(name = "lecturePassword")
    private String password;
    private HashSet<User> user;
    private HashSet<Project> project;

    public Lecture(){

    }

    public Lecture(String lectureName, String password) {
        this.lectureName = lectureName;
        this.password = password;
    }

}
