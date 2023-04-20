package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.Model.Education;
import com.example.backend.repository.EducationRepository;

@Service
public class EducationService implements IEducationService{

    @Autowired
    public EducationRepository educationRepository;

    @Override
    public List<Education> getEducationList() {
        return educationRepository.findAll();
    }

    @Override
    public void saveEducation(Education education) {
        educationRepository.save(education);
    }

    @Override
    public void deleteEducation(Long id) {
        educationRepository.deleteById(id);;
    }

    @Override
    public Education searchEducation(Long id) {
        return educationRepository.findById(id).orElse(null);
    }
    
}
