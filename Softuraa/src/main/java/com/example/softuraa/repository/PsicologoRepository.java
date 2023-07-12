package com.example.softuraa.repository;

import com.example.softuraa.model.Psicologo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PsicologoRepository extends JpaRepository<Psicologo, Long> {
    // Métodos adicionales para consultas específicas si es necesario
}
