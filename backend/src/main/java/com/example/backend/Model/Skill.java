package com.example.backend.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nombre;

    @OneToMany(targetEntity = SkillItem.class, cascade = CascadeType.ALL)
    private List<SkillItem> conocimientos;

    public Skill(){

    }

    public Skill(Long id, String nombre, List<SkillItem> conocimientos){
        this.id = id;
        this.nombre = nombre;
        this.conocimientos = conocimientos;
    }

}
