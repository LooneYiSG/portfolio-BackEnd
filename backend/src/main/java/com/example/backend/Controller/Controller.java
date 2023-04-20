package com.example.backend.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.backend.Model.Education;
import com.example.backend.Model.Project;
import com.example.backend.Model.Skill;
import com.example.backend.Model.Work;
import com.example.backend.service.IEducationService;
import com.example.backend.service.IProjectService;
import com.example.backend.service.ISkillService;
import com.example.backend.service.IWorkService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
public class Controller {

    //Inyectamos los Servicios de Educations
    @Autowired
    private IEducationService educationService;

    //Mapeamos los metodos http para la entidad education
    @PostMapping("/new/education")
    public void addEducation (@RequestBody Education education){
        educationService.saveEducation(education);
    }

    @GetMapping("/list/education")
    @ResponseBody
    public List<Education> getEducations(){
        return educationService.getEducationList();
    }

    @DeleteMapping("/delete/education/{id}")
    public void deleteEducation(@PathVariable Long id){
        educationService.deleteEducation(id);
    }

    @PutMapping("/modify/education")
    public void updateEducation(@RequestBody Education education){
        educationService.deleteEducation(education.getId());
        educationService.saveEducation(education);
    }

    //Inyectamos los Servicios de Skills
    @Autowired
    private ISkillService skillService;

    //Mapeamos los metodos http para la entidad skill
    @PostMapping("/new/skill")
    public void addSkill (@RequestBody Skill skill){
        skillService.saveSkill(skill);
    }

    @GetMapping("/list/skill")
    @ResponseBody
    public List<Skill> getSkills(){
        return skillService.getSkillList();
    }

    @DeleteMapping("/delete/skill/{id}")
    public void deleteSkill(@PathVariable Long id){
        skillService.deleteSkill(id);
    }

    @PutMapping("/modify/skill")
    public void updateSkill(@RequestBody Skill skill){
        skillService.deleteSkill(skill.getId());
        skillService.saveSkill(skill);
    }

    //Inyectamos los Servicios de Works
    @Autowired
    private IWorkService workService;

    //Mapeamos los metodos http para la entidad skill
    @PostMapping("/new/work")
    public void addSkill (@RequestBody Work work){
        workService.saveWork(work);
    }

    @GetMapping("/list/work")
    @ResponseBody
    public List<Work> getWorks(){
        return workService.getWorkList();
    }

    @DeleteMapping("/delete/work/{id}")
    public void deleteWork(@PathVariable Long id){
        workService.deleteWork(id);
    }

    @PutMapping("/modify/work")
    public void updateWork(@RequestBody Work work){
        workService.deleteWork(work.getId());
        workService.saveWork(work);
    }

    //Inyectamos los Servicios de Projects
    @Autowired
    private IProjectService projectService;

    //Mapeamos los metodos http para la entidad skill
    @PostMapping("/new/project")
    public void addProject (@RequestBody Project project){
        projectService.saveProject(project);
    }

    @GetMapping("/list/project")
    @ResponseBody
    public List<Project> getProjects(){
        return projectService.getProjectList();
    }

    @DeleteMapping("/delete/project/{id}")
    public void deleteProject(@PathVariable Long id){
        projectService.deleteProject(id);
    }

    @PutMapping("/modify/project")
    public void updateWork(@RequestBody Project project){
        projectService.deleteProject(project.getId());
        projectService.saveProject(project);
    }

}
