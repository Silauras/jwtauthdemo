package com.example.jwtauthdemo.repository;

import com.example.jwtauthdemo.models.ERole;
import com.example.jwtauthdemo.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
