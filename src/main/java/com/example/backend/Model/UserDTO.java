package com.example.backend.Model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class UserDTO {

    private Long id;
    private String nombre;
    private String apellido;
    private String sobre_mi;
    private String foto;

    public UserDTO(Long id, String nombre, String apellido, String sobre_mi, String foto) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sobre_mi = sobre_mi;
        this.foto = foto;
    }

    public UserDTO(){
        
    }
    
}
