package com.example.softuraa.service.ServiceIMPL;

import com.example.softuraa.model.Cita;
import com.example.softuraa.repository.CitaRepository;
import com.example.softuraa.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaServiceImpl implements CitaService {
    private final CitaRepository citaRepository;

    @Autowired
    public CitaServiceImpl(CitaRepository citaRepository) {
        this.citaRepository = citaRepository;
    }

    @Override
    public Cita crearCita(Cita cita) {
        return citaRepository.save(cita);
    }

    @Override
    public Cita obtenerCitaPorId(Long id) {
        return citaRepository.findById(id).orElse(null);
    }

    @Override
    public Cita actualizarCita(Cita cita) {
        return citaRepository.save(cita);
    }

    @Override
    public void eliminarCita(Long id) {
        citaRepository.deleteById(id);
    }
}
