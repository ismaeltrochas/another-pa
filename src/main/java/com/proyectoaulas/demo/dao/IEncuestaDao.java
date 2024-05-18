package com.proyectoaulas.demo.dao;

import com.proyectoaulas.demo.entity.Encuesta;

import java.util.List;
import java.util.Optional;

public interface IEncuestaDao {
    List<Encuesta> findAll();

    Optional<Encuesta> findById(Long id);

    Encuesta save(Encuesta entity);

    void deleteById(Encuesta id);
}
