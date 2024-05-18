package com.proyectoaulas.demo.dao;

import com.proyectoaulas.demo.entity.AgendaCita;

import java.util.List;
import java.util.Optional;

public interface IAgendaCitaDao {
    List<AgendaCita> findAll();

    Optional<AgendaCita> findById(Long id);

    AgendaCita save(AgendaCita entity);

    void deleteById(Long id);
}
