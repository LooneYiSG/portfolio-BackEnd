package com.example.backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class SkillItem {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    
    private String nombre;
    private Byte nivel;

    public SkillItem(){

    }

    public SkillItem(Long id, String nombre, Byte nivel){
        this.id = id;
        this.nombre = nombre;
        this.nivel = nivel;
    }

}
