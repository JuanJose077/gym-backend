package com.gym.gymtracker.application.service;

import com.gym.gymtracker.domain.model.Usuario;
import com.gym.gymtracker.domain.ports.in.UsuarioServicePort;
import com.gym.gymtracker.domain.ports.out.UsuarioRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService implements UsuarioServicePort {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    @Override
    public Usuario guardar(Usuario usuario) {
        return usuarioRepositoryPort.guardar(usuario);
    }

    @Override
    public List<Usuario> listar() {
        return usuarioRepositoryPort.listar();
    }

    @Override
    public Usuario buscarPorId(Long id) {
        return usuarioRepositoryPort.buscarPorId(id).orElse(null);
    }

    @Override
    public void eliminar(Long id) {
        usuarioRepositoryPort.eliminar(id);
    }

}
