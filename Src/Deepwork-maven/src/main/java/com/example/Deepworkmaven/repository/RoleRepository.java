package com.example.Deepworkmaven.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Deepworkmaven.entity.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String name);
}