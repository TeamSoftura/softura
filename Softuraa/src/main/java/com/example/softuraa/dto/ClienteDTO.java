package com.example.softuraa.dto;

import lombok.Data;

@Data
public class ClienteDTO {
    private Long clienteID;
    private Long usuarioID;
    private int edad;
    private String genero;
    private String correoElectronico;

    // Constructor, getters y setters
}
