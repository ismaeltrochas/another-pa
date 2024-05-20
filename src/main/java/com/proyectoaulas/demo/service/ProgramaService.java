package com.proyectoaulas.demo.service;

import com.proyectoaulas.demo.entity.Programa;
import com.proyectoaulas.demo.repository.ProgramaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProgramaService {

  private final ProgramaRepository repository;

  @Autowired
  public ProgramaService(ProgramaRepository repository) {
    this.repository = repository;
  }

  public List<Programa> findAll() {
    return repository.findAll();
  }

  public Optional<Programa> findById(Long id) {
    return repository.findById(id);
  }

  public Programa save(Programa entity) {
    return repository.save(entity);
  }

  public void deleteById(Long id) {
    repository.deleteById(id);
  }
}

