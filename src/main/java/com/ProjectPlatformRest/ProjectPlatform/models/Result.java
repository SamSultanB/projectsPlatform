package com.ProjectPlatformRest.ProjectPlatform.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

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
    @Column(name = "uploadedAt")
    private LocalDateTime uploadedAt;
    @Column(name = "grade")
    private String grade;
    @Column(name = "comment")
    private String comment;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, cascade=CascadeType.ALL)
    @JoinColumn(name = "project_id")
    private Project project;

    public Result(){

    }

    public Result(String fileName, LocalDateTime uploadedAt) {
        this.fileName = fileName;
        this.uploadedAt = uploadedAt;
    }

}
