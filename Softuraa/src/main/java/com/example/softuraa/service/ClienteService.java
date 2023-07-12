package com.example.softuraa.service;

import com.example.softuraa.model.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {
    Cliente crearCliente(Cliente cliente);
    Cliente obtenerClientePorId(Long id);
    Cliente actualizarCliente(Cliente cliente);
    void eliminarCliente(Long id);
}
