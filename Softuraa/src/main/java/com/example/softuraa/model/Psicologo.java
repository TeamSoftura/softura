package com.example.softuraa.model;
import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
@Table(name = "Psicologos")
public class Psicologo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long psicologoID;

    @OneToOne
    @JoinColumn(name = "usuarioID")
    private Usuario usuario;

    private String especialidad;

    private String descripcion;

    private double precioSesion;

    private String disponibilidad;

    private String licenciaCertificaciones;

    private String experienciaLaboral;

    // Constructor, getters y setters
}
