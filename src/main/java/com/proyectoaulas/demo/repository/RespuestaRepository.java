package com.proyectoaulas.demo.repository;

import com.proyectoaulas.demo.entity.Programa;
import com.proyectoaulas.demo.entity.Respuesta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaRepository extends JpaRepository<Respuesta, Long> {
}
