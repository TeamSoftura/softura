package com.example.softuraa.repository;
import com.example.softuraa.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Métodos adicionales para consultas específicas si es necesario
}
