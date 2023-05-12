package com.example.backend.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.backend.Model.Education;
import com.example.backend.Model.Project;
import com.example.backend.Model.Skill;
import com.example.backend.Model.User;
import com.example.backend.Model.UserDTO;
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
    public User addUser (@RequestBody User user){
        return userService.saveUser(user);
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
    public User updateUser(@RequestBody User user){
        User updateUser = userService.searchUser(user.getId());
        updateUser.setNombre(user.getNombre());
        updateUser.setApellido(user.getApellido());
        updateUser.setSobre_mi(user.getSobre_mi());
        updateUser.setFoto(user.getFoto());
        return userService.saveUser(updateUser);
    }

    @PostMapping("/api/login")
    public UserDTO login(@RequestBody User user){
        return userService.login(user.getEmail(),user.getPassword());
    }

    //Inyectamos los Servicios de Educations
    @Autowired
    private IEducationService educationService;

    //Mapeamos los metodos http para la entidad education
    @PostMapping("/api/new/education")
    public Education addEducation (@RequestBody Education education){
        return educationService.saveEducation(education);
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
    public Education updateEducation(@RequestBody Education education){
        Education updateEducation = educationService.searchEducation(education.getId());
        updateEducation.setInstitucion(education.getInstitucion());
        updateEducation.setFecha_ingreso(education.getFecha_ingreso());
        updateEducation.setFecha_egreso(education.getFecha_egreso());
        updateEducation.setDescripcion(education.getDescripcion());
        updateEducation.setFoto(education.getFoto());
        return educationService.saveEducation(updateEducation);
    }

    //Inyectamos los Servicios de Skills
    @Autowired
    private ISkillService skillService;

    //Mapeamos los metodos http para la entidad skill
    @PostMapping("/api/new/skill")
    public Skill addSkill (@RequestBody Skill skill){
        return skillService.saveSkill(skill);
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
    public Skill updateSkill(@RequestBody Skill skill){
        Skill updateSkill = skillService.searchSkill(skill.getId());
        updateSkill.setNombre(skill.getNombre());
        updateSkill.setConocimientos(skill.getConocimientos());
        return skillService.saveSkill(updateSkill);
    }

    //Inyectamos los Servicios de Works
    @Autowired
    private IWorkService workService;

    //Mapeamos los metodos http para la entidad skill
    @PostMapping("/api/new/work")
    public Work addSkill (@RequestBody Work work){
        return workService.saveWork(work);
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
    public Work updateWork(@RequestBody Work work){
        Work updateWork = workService.searchWork(work.getId());
        updateWork.setInstitucion(work.getInstitucion());
        updateWork.setCargo(work.getCargo());
        updateWork.setFecha_desde(work.getFecha_desde());
        updateWork.setFecha_hasta(work.getFecha_hasta());
        updateWork.setDescripcion(work.getDescripcion());
        return workService.saveWork(updateWork);
    }

    //Inyectamos los Servicios de Projects
    @Autowired
    private IProjectService projectService;

    //Mapeamos los metodos http para la entidad skill
    @PostMapping("/api/new/project")
    public Project addProject (@RequestBody Project project){
        return projectService.saveProject(project);
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
    public Project updateWork(@RequestBody Project project){
        Project updateProject = projectService.searchProject(project.getId());
        updateProject.setNombre(project.getNombre());
        updateProject.setFoto(project.getFoto());
        updateProject.setDescripcion(project.getDescripcion());
        return projectService.saveProject(updateProject);
    }

}
