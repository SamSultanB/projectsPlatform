package com.ProjectPlatformRest.ProjectPlatform.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "Results")
@Getter
@Setter
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "fileName")
    private String fileName;
    @Column(name = "grade")
    private String grade;
    @Column(name = "comment")
    private String comment;

    public Result(){

    }

    public Result(String fileName) {
        this.fileName = fileName;
    }

}
