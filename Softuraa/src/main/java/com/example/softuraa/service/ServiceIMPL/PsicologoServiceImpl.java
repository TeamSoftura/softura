package com.example.softuraa.service.ServiceIMPL;

import com.example.softuraa.model.Psicologo;
import com.example.softuraa.repository.PsicologoRepository;
import com.example.softuraa.service.PsicologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PsicologoServiceImpl implements PsicologoService {
    private final PsicologoRepository psicologoRepository;

    @Autowired
    public PsicologoServiceImpl(PsicologoRepository psicologoRepository) {
        this.psicologoRepository = psicologoRepository;
    }

    @Override
    public Psicologo crearPsicologo(Psicologo psicologo) {
        return psicologoRepository.save(psicologo);
    }

    @Override
    public Psicologo obtenerPsicologoPorId(Long id) {
        return psicologoRepository.findById(id).orElse(null);
    }

    @Override
    public Psicologo actualizarPsicologo(Psicologo psicologo) {
        return psicologoRepository.save(psicologo);
    }

    @Override
    public void eliminarPsicologo(Long id) {
        psicologoRepository.deleteById(id);
    }
}
