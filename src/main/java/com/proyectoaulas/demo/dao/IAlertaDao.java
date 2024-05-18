package com.proyectoaulas.demo.dao;

import com.proyectoaulas.demo.entity.Alerta;

import java.util.List;
import java.util.Optional;

public interface IAlertaDao {
    List<Alerta> findAll();

    Optional<Alerta> findById(Long id);

    Alerta save(Alerta entity);

    void deleteById(Alerta id);
}
