package com.example.backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nombre;
    private String descripcion;
    private String foto;

    public Project(){

    }

    public Project(Long id, String nombre, String descripcion, String foto){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.foto = foto;
    }

}
