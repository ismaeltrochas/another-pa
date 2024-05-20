package com.proyectoaulas.demo.controller;
import com.proyectoaulas.demo.entity.Cita;
import com.proyectoaulas.demo.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/citas")
public class CitaController {

  private final CitaService citaService;

  @Autowired
  public CitaController(CitaService citaService) {
    this.citaService = citaService;
  }

  @GetMapping
  public List<Cita> findAll() {
    return citaService.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Cita> findById(@PathVariable Long id) {
    return citaService.findById(id);
  }

  @PostMapping
  public Cita save(@RequestBody Cita cita) {
    return citaService.save(cita);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    citaService.deleteById(id);
  }
}
