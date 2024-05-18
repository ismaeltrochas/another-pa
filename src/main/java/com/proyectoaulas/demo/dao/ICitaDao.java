package com.proyectoaulas.demo.dao;

import com.proyectoaulas.demo.entity.Cita;

import java.util.List;
import java.util.Optional;

public interface ICitaDao {
    List<Cita> findAll();

    Optional<Cita> findById(Long id);

    Cita save(Cita entity);

    void deleteById(Cita id);
}
