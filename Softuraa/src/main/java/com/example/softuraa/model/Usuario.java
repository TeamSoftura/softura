package com.example.softuraa.model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name = "Usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioID;

    private String nombre;

    private String apellido;

    private String correoElectronico;

    private String contrasena;

    private String rol;

    // Constructor, getters y setters
}
