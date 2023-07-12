package com.example.softuraa.repository;
import com.example.softuraa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
        // Métodos adicionales para consultas específicas si es necesario
    }


