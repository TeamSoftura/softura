package com.example.softuraa.model;


import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Data
@Entity
@Table(name = "Citas")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long citaID;

    @ManyToOne
    @JoinColumn(name = "psicologoID")
    private Psicologo psicologo;

    @ManyToOne
    @JoinColumn(name = "clienteID")
    private Cliente cliente;

    private LocalDateTime fechaHoraCita;

    private String estadoCita;

    private int duracionSesion;

    private boolean recordatorio;

    private LocalDateTime fechaHoraRecordatorio;

    private int calificacionSesion;

    private String comentarios;

    // Constructor, getters y setters
}
