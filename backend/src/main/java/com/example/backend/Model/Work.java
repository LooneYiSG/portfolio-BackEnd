package com.example.backend.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Work {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String institucion;
    private String cargo;
    private String fecha_desde;
    private String fecha_hasta;
    private String descripcion;

    public Work(){

    }

    public Work(Long id, String institucion, String cargo, String fecha_desde, String fecha_hasta, String descripcion){
        this.id = id;
        this.institucion = institucion;
        this.cargo = cargo;
        this.fecha_desde = fecha_desde;
        this.fecha_hasta = fecha_hasta;
        this.descripcion = descripcion;
    }
}
