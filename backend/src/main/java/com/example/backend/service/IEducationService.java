package com.example.backend.service;

import java.util.List;

import com.example.backend.Model.Education;

public interface IEducationService {

    public List<Education> getEducationList();

    public void saveEducation (Education education);

    public void deleteEducation (Long id);

    public Education searchEducation (Long id); 

}
