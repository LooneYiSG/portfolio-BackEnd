package com.example.backend.service;

import java.util.List;

import com.example.backend.Model.Skill;

public interface ISkillService {
    
    public List<Skill> getSkillList();

    public void saveSkill(Skill skill);

    public void deleteSkill(Long id);

    public Skill searchSkill(Long id);

}
