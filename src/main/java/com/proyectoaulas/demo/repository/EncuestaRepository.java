package com.proyectoaulas.demo.repository;

import com.proyectoaulas.demo.entity.Encuesta;
import com.proyectoaulas.demo.entity.Programa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EncuestaRepository  extends JpaRepository<Encuesta, Long> {
}
