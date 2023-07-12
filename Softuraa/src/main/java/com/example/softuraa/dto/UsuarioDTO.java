package com.example.softuraa.dto;

import lombok.Data;

@Data

public class UsuarioDTO {
    private Long usuarioID;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private String contrasena;
    private String rol;
}
