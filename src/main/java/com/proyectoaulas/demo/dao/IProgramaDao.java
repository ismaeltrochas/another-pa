package com.proyectoaulas.demo.dao;

import com.proyectoaulas.demo.entity.Programa;

import java.util.List;
import java.util.Optional;

public interface IProgramaDao {

    List<Programa> findAll();

    Optional<Programa> findById(Long id);

    Programa save(Programa entity);

    void deleteById(Programa id);

}
