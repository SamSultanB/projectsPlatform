package com.ProjectPlatformRest.ProjectPlatform.models;

import java.util.HashSet;

public class Lecture {
    private Long id;
    private String lectureName;
    private HashSet<User> user;
    private HashSet<Project> project;
}
