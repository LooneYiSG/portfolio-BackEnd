package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.Model.Skill;
import com.example.backend.repository.SkillRepository;

@Service
public class SkillService implements ISkillService{

    @Autowired
    public SkillRepository skillRepository;

    @Override
    public List<Skill> getSkillList() {
        return skillRepository.findAll();
    }

    @Override
    public Skill saveSkill(Skill skill) {
        return skillRepository.save(skill);
    }

    @Override
    public void deleteSkill(Long id) {
        skillRepository.deleteById(id);
    }

    @Override
    public Skill searchSkill(Long id) {
        return skillRepository.findById(id).orElse(null);
    }
    
}
