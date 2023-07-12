package com.example.softuraa.repository;

import com.example.softuraa.model.Cita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CitaRepository extends JpaRepository<Cita, Long> {
    // Métodos adicionales para consultas específicas si es necesario
}
