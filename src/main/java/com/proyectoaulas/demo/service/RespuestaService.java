package com.proyectoaulas.demo.service;
import com.proyectoaulas.demo.entity.Respuesta;
import com.proyectoaulas.demo.repository.RespuestaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RespuestaService {

  private final RespuestaRepository repository;

  @Autowired
  public RespuestaService(RespuestaRepository repository) {
    this.repository = repository;
  }

  public List<Respuesta> findAll() {
    return repository.findAll();
  }

  public Optional<Respuesta> findById(Long id) {
    return repository.findById(id);
  }

  public Respuesta save(Respuesta entity) {
    return repository.save(entity);
  }

  public void deleteById(Long id) {
    repository.deleteById(id);
  }
}
