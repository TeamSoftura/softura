package com.example.softuraa.service.ServiceIMPL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluacionServiceImpl implements EvaluacionService {
    private final EvaluacionRepository evaluacionRepository;

    @Autowired
    public EvaluacionServiceImpl(EvaluacionRepository evaluacionRepository) {
        this.evaluacionRepository = evaluacionRepository;
    }

    @Override
    public Evaluacion crearEvaluacion(Evaluacion evaluacion) {
        return evaluacionRepository.save(evaluacion);
    }

    @Override
    public Evaluacion obtenerEvaluacionPorId(Long id) {
        return evaluacionRepository.findById(id).orElse(null);
    }

    @Override
    public Evaluacion actualizarEvaluacion(Evaluacion evaluacion) {
        return evaluacionRepository.save(evaluacion);
    }

    @Override
    public void eliminarEvaluacion(Long id) {
        evaluacionRepository.deleteById(id);
    }
}
