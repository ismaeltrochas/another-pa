package com.proyectoaulas.demo.service;

import com.proyectoaulas.demo.entity.Alerta;
import com.proyectoaulas.demo.repository.AlertaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AlertaService {
    @Autowired
    private AlertaRepository repository;

    public List<Alerta> findAll() {
        return repository.findAll();
    }

    public Optional<Alerta> findById(Long id) {
        return repository.findById(id);
    }

    public Alerta save(Alerta alerta) {
        return repository.save(alerta);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
