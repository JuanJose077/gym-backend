package com.gym.gymtracker.domain.ports.in;

import com.gym.gymtracker.domain.model.Usuario;

import java.util.List;

public interface UsuarioServicePort {
    Usuario guardar(Usuario usuario);
    List<Usuario> listar();
    Usuario buscarPorId(Long id);
    void eliminar(Long id);
}
