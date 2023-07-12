package com.example.softuraa.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CitaDTO {
    private Long citaID;
    private Long psicologoID;
    private Long clienteID;
    private LocalDateTime fechaHoraCita;
    private String estadoCita;
    private int duracionSesion;
    private boolean recordatorio;
    private LocalDateTime fechaHoraRecordatorio;
    private int calificacionSesion;
    private String comentarios;

    // Constructor, getters y setters
}
