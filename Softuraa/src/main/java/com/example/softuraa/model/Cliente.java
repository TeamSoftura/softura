package com.example.softuraa.model;

    import jakarta.persistence.*;
    import lombok.Data;
@Data
    @Entity
    @Table(name = "Clientes")
    public class Cliente {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long clienteID;

        @OneToOne
        @JoinColumn(name = "usuarioID")
        private Usuario usuario;

        private int edad;

        private String genero;

        private String correoElectronico;

        // Otros campos de información adicional del cliente

        // Constructor, getters y setters
    }


