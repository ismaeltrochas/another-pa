package com.proyectoaulas.demo.dao;

import com.proyectoaulas.demo.entity.Respuesta;

import java.util.List;
import java.util.Optional;

public interface IRespuestaDao {
    List<Respuesta> findAll();

    Optional<Respuesta> findById(Long id);

    Respuesta save(Respuesta entity);

    void deleteById(Respuesta id);

}
