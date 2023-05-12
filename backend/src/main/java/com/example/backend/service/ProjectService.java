package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.Model.Project;
import com.example.backend.repository.ProjectRepository;

@Service
public class ProjectService implements IProjectService{

    @Autowired
    public ProjectRepository projectRepository;

    @Override
    public List<Project> getProjectList() {
        return projectRepository.findAll();
    }

    @Override
    public Project saveProject(Project project) {
        return projectRepository.save(project);
    }

    @Override
    public void deleteProject(Long id) {
        projectRepository.deleteById(id);
    }

    @Override
    public Project searchProject(Long id) {
        return projectRepository.findById(id).orElse(null);
    }
    
}
