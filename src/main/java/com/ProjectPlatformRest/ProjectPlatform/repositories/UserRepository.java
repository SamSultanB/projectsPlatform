package com.ProjectPlatformRest.ProjectPlatform.repositories;

import com.ProjectPlatformRest.ProjectPlatform.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
