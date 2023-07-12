package com.example.softuraa.service;
import com.example.softuraa.model.Psicologo;
import org.springframework.stereotype.Service;

@Service
public interface PsicologoService {
    Psicologo crearPsicologo(Psicologo psicologo);
    Psicologo obtenerPsicologoPorId(Long id);
    Psicologo actualizarPsicologo(Psicologo psicologo);
    void eliminarPsicologo(Long id);
}
