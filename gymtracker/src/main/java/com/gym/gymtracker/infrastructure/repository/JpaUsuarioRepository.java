package com.gym.gymtracker.infrastructure.repository;


import com.gym.gymtracker.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUsuarioRepository extends JpaRepository<Usuario, Long> {
}