package com.example.security.repository;

import java.util.Optional;

import com.example.security.models.ERole;
import com.example.security.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
