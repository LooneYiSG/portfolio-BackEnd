package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.Model.Project;

@Repository
public interface ProjectRepository extends JpaRepository <Project, Long> {
    
}
