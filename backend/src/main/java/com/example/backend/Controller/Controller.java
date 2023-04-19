package com.example.backend.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.backend.Model.Education;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class Controller {
    
    List<Education> educationList = new ArrayList<Education>();

    @GetMapping("/")
    public String decirHola() {
        return "Hola soy tu backend";
    }
    
    @PostMapping("/new/education")
    public void addEducation (@RequestBody Education education){
        educationList.add(education);
    }

    @GetMapping("/list/education")
    @ResponseBody
    public List<Education> getEducations(){
        return educationList;
    }
}
