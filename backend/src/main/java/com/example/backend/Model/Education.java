package com.example.backend.Model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Education {
    private Long id;
    private String institucion;
    private String fecha_ingreso;
    private String fecha_egreso;
    private String descripcion;
    private String foto;

    public Education(){

    }

    public Education(Long id, String institucion, String fecha_ingreso, String fecha_egreso, String descripcion, String foto){
        this.id = id;
        this.institucion = institucion;
        this.fecha_ingreso = fecha_ingreso;
        this.fecha_egreso = fecha_egreso;
        this.descripcion = descripcion;
        this.foto = foto;
    }
}
