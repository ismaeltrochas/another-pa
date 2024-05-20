package com.proyectoaulas.demo.controller;
import com.proyectoaulas.demo.entity.Alerta;
import com.proyectoaulas.demo.service.AlertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/alertas")
public class AlertaController {

  @Autowired
  private final AlertaService alertaService;

  @Autowired
  public AlertaController(AlertaService alertaService) {
    this.alertaService = alertaService;
  }

  @GetMapping
  public List<Alerta> findAll() {
    return alertaService.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Alerta> findById(@PathVariable Long id) {
    return alertaService.findById(id);
  }

  @PostMapping
  public Alerta save(@RequestBody Alerta alerta) {
    return alertaService.save(alerta);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    alertaService.deleteById(id);
  }
}

