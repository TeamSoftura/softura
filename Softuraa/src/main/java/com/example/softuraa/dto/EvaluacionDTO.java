package com.example.softuraa.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EvaluacionDTO {
    private Long evaluacionID;
    private Long psicologoID;
    private Long clienteID;
    private int calificacion;
    private String comentarios;
    private LocalDateTime fechaHoraEvaluacion;

    // Constructor, getters y setters
}
