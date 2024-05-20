package com.proyectoaulas.demo.service;
import com.proyectoaulas.demo.entity.Permanencia;
import com.proyectoaulas.demo.repository.PermanenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PermanenciaService {

  private final PermanenciaRepository repository;

  @Autowired
  public PermanenciaService(PermanenciaRepository repository) {
    this.repository = repository;
  }

  public List<Permanencia> findAll() {
    return repository.findAll();
  }

  public Optional<Permanencia> findById(Long id) {
    return repository.findById(id);
  }

  public Permanencia save(Permanencia entity) {
    return repository.save(entity);
  }

  public void deleteById(Long id) {
    repository.deleteById(id);
  }
}
