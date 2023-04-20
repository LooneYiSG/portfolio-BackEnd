package com.example.backend.service;

import java.util.List;

import com.example.backend.Model.Project;

public interface IProjectService {
    
    public List<Project> getProjectList();

    public void saveProject(Project project);

    public void deleteProject(Long id);

    public Project searchProject(Long id);

}
