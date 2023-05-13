package com.example.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.Model.Work;
import com.example.backend.repository.WorkRepository;

@Service
public class WorkService implements IWorkService{

    @Autowired
    public WorkRepository workRepository;

    @Override
    public List<Work> getWorkList() {
        return workRepository.findAll();
    }

    @Override
    public Work saveWork(Work work) {
        return workRepository.save(work);
    }

    @Override
    public void deleteWork(Long id) {
        workRepository.deleteById(id);
    }

    @Override
    public Work searchWork(Long id) {
        return workRepository.findById(id).orElse(null);
    }
    
}
