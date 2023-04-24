package com.example.backend.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.backend.Model.Education;
import com.example.backend.Model.Project;
import com.example.backend.Model.Skill;
import com.example.backend.Model.User;
import com.example.backend.Model.Work;
import com.example.backend.service.IEducationService;
import com.example.backend.service.IProjectService;
import com.example.backend.service.ISkillService;
import com.example.backend.service.IUserService;
import com.example.backend.service.IWorkService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


@RestController
@CrossOrigin (origins = "http://localhost:4200")
public class Controller {

    //Inyectamos los Servicios de User
    @Autowired
    private IUserService userService;

    //Mapeamos los metodos http para la entidad user
    @PostMapping("/api/new/user")
    public void addUser (@RequestBody User user){
        userService.saveUser(user);
    }

    @GetMapping("/api/list/user")
    @ResponseBody
    public List<User> getUsers(){
        return userService.getUserList();
    }

    @DeleteMapping("/api/delete/user/{id}")
    public void deleteUser(@PathVariable Long id){
        userService.deleteUser(id);
    }

    @PutMapping("/api/modify/user")
    public void updateUser(@RequestBody User user){
        userService.deleteUser(user.getId());
        userService.saveUser(user);
    }

    //Inyectamos los Servicios de Educations
    @Autowired
    private IEducationService educationService;

    //Mapeamos los metodos http para la entidad education
    @PostMapping("/api/new/education")
    public void addEducation (@RequestBody Education education){
        educationService.saveEducation(education);
    }

    @GetMapping("/api/list/education")
    @ResponseBody
    public List<Education> getEducations(){
        return educationService.getEducationList();
    }

    @DeleteMapping("/api/delete/education/{id}")
    public void deleteEducation(@PathVariable Long id){
        educationService.deleteEducation(id);
    }

    @PutMapping("/api/modify/education")
    public void updateEducation(@RequestBody Education education){
        educationService.deleteEducation(education.getId());
        educationService.saveEducation(education);
    }

    //Inyectamos los Servicios de Skills
    @Autowired
    private ISkillService skillService;

    //Mapeamos los metodos http para la entidad skill
    @PostMapping("/api/new/skill")
    public void addSkill (@RequestBody Skill skill){
        skillService.saveSkill(skill);
    }

    @GetMapping("/api/list/skill")
    @ResponseBody
    public List<Skill> getSkills(){
        return skillService.getSkillList();
    }

    @DeleteMapping("/api/delete/skill/{id}")
    public void deleteSkill(@PathVariable Long id){
        skillService.deleteSkill(id);
    }

    @PutMapping("/api/modify/skill")
    public void updateSkill(@RequestBody Skill skill){
        skillService.deleteSkill(skill.getId());
        skillService.saveSkill(skill);
    }

    //Inyectamos los Servicios de Works
    @Autowired
    private IWorkService workService;

    //Mapeamos los metodos http para la entidad skill
    @PostMapping("/api/new/work")
    public void addSkill (@RequestBody Work work){
        workService.saveWork(work);
    }

    @GetMapping("/api/list/work")
    @ResponseBody
    public List<Work> getWorks(){
        return workService.getWorkList();
    }

    @DeleteMapping("/api/delete/work/{id}")
    public void deleteWork(@PathVariable Long id){
        workService.deleteWork(id);
    }

    @PutMapping("/api/modify/work")
    public void updateWork(@RequestBody Work work){
        workService.deleteWork(work.getId());
        workService.saveWork(work);
    }

    //Inyectamos los Servicios de Projects
    @Autowired
    private IProjectService projectService;

    //Mapeamos los metodos http para la entidad skill
    @PostMapping("/api/new/project")
    public void addProject (@RequestBody Project project){
        projectService.saveProject(project);
    }

    @GetMapping("/api/list/project")
    @ResponseBody
    public List<Project> getProjects(){
        return projectService.getProjectList();
    }

    @DeleteMapping("/api/delete/project/{id}")
    public void deleteProject(@PathVariable Long id){
        projectService.deleteProject(id);
    }

    @PutMapping("/api/modify/project")
    public void updateWork(@RequestBody Project project){
        projectService.deleteProject(project.getId());
        projectService.saveProject(project);
    }

}
