package com.example.softuraa.service;
import com.example.softuraa.model.Usuario;
import org.springframework.stereotype.Service;

    @Service
    public interface UsuarioService {
        Usuario crearUsuario(Usuario usuario);
        Usuario obtenerUsuarioPorId(Long id);
        Usuario actualizarUsuario(Usuario usuario);
        void eliminarUsuario(Long id);
    }


