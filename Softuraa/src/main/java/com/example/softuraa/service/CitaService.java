package com.example.softuraa.service;

import com.example.softuraa.model.Cita;
import org.springframework.stereotype.Service;

@Service
public interface CitaService {
    Cita crearCita(Cita cita);
    Cita obtenerCitaPorId(Long id);
    Cita actualizarCita(Cita cita);
    void eliminarCita(Long id);
}
