package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.Model.Work;

@Repository
public interface WorkRepository extends JpaRepository <Work, Long> {
    
}
