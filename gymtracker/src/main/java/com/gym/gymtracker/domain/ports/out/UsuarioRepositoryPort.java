package com.gym.gymtracker.domain.ports.out;

import com.gym.gymtracker.domain.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepositoryPort {
    Usuario guardar(Usuario usuario);
    List<Usuario> listar();
    Optional<Usuario> buscarPorId(Long id);
    void eliminar(Long id);
}
