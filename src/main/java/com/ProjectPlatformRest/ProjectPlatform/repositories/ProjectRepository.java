package com.ProjectPlatformRest.ProjectPlatform.repositories;

import com.ProjectPlatformRest.ProjectPlatform.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
