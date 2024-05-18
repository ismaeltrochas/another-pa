package com.proyectoaulas.demo.dao;

import com.proyectoaulas.demo.entity.Permanencia;
import java.util.List;
import java.util.Optional;

public interface IPermanenciaDao {
    List<Permanencia> findAll();

    Optional<Permanencia> findById(Long id);

    Permanencia save(Permanencia entity);

    void deleteById(Permanencia id);
}
