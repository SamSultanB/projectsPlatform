package com.ProjectPlatformRest.ProjectPlatform.repositories;

import com.ProjectPlatformRest.ProjectPlatform.models.Lecture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectureRepository extends JpaRepository<Lecture, Long> {
}
