package com.example.softuraa.dto;

import lombok.Data;

@Data
public class PsicologoDTO {
    private Long psicologoID;
    private Long usuarioID;
    private String especialidad;
    private String descripcion;
    private String disponibilidad;
    private String licenciaCertificaciones;
    private String experienciaLaboral;

    // Constructor, getters y setters
}
