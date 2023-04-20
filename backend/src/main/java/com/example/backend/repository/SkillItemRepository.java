package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.backend.Model.SkillItem;

@Repository
public interface SkillItemRepository extends JpaRepository <SkillItem, Long> {
    
}
