package com.example.backend.service;

import java.util.List;

import com.example.backend.Model.Work;

public interface IWorkService {

    public List<Work> getWorkList();

    public void saveWork(Work work);

    public void deleteWork(Long id);
    
    public Work searchWork(Long id);

}
