package com.proyectoaulas.demo.service;

import com.proyectoaulas.demo.entity.Cita;
import com.proyectoaulas.demo.repository.CitaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaService {

  private final CitaRepository repository;

  @Autowired
  public CitaService(CitaRepository repository) {
    this.repository = repository;
  }

  public List<Cita> findAll() {
    return repository.findAll();
  }

  public Optional<Cita> findById(Long id) {
    return repository.findById(id);
  }

  public Cita save(Cita entity) {
    return repository.save(entity);
  }

  public void deleteById(Long id) {
    repository.deleteById(id);
  }
}
