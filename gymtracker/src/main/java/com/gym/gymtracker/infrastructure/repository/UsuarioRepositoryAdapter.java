package com.gym.gymtracker.infrastructure.repository;

import com.gym.gymtracker.domain.model.Usuario;
import com.gym.gymtracker.domain.ports.out.UsuarioRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
@RequiredArgsConstructor
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    private final JpaUsuarioRepository jpaUsuarioRepository;

    @Override
    public Usuario guardar(Usuario usuario) {
        return jpaUsuarioRepository.save(usuario);
    }

    @Override
    public List<Usuario> listar() {
        return jpaUsuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> buscarPorId(Long id) {
        return jpaUsuarioRepository.findById(id);
    }

    @Override
    public void eliminar(Long id) {
        jpaUsuarioRepository.deleteById(id);
    }
}