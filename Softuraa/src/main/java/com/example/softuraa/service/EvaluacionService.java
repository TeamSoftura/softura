package com.example.softuraa.service;

import org.springframework.stereotype.Service;

@Service
public interface EvaluacionService {
    Evaluacion crearEvaluacion(Evaluacion evaluacion);
    Evaluacion obtenerEvaluacionPorId(Long id);
    Evaluacion actualizarEvaluacion(Evaluacion evaluacion);
    void eliminarEvaluacion(Long id);
}
