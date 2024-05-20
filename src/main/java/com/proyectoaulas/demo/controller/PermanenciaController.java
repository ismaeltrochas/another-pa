package com.proyectoaulas.demo.controller;
import com.proyectoaulas.demo.entity.Permanencia;
import com.proyectoaulas.demo.service.PermanenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/permanencias")
public class PermanenciaController {

  private final PermanenciaService permanenciaService;

  @Autowired
  public PermanenciaController(PermanenciaService permanenciaService) {
    this.permanenciaService = permanenciaService;
  }

  @GetMapping
  public List<Permanencia> findAll() {
    return permanenciaService.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Permanencia> findById(@PathVariable Long id) {
    return permanenciaService.findById(id);
  }

  @PostMapping
  public Permanencia save(@RequestBody Permanencia permanencia) {
    return permanenciaService.save(permanencia);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    permanenciaService.deleteById(id);
  }
}
