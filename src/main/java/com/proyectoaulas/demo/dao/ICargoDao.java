package com.proyectoaulas.demo.dao;

import com.proyectoaulas.demo.entity.Cargo;
import java.util.List;
import java.util.Optional;

public interface ICargoDao {

  List<Cargo> findAll();

  Optional<Cargo> findById(Long id);

  Cargo save(Cargo entity);

  void deleteById(Long id);
}
