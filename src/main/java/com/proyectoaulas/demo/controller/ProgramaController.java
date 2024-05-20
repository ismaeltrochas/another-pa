package com.proyectoaulas.demo.controller;
import com.proyectoaulas.demo.entity.Programa;
import com.proyectoaulas.demo.service.ProgramaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/programas")
public class ProgramaController {

  private final ProgramaService programaService;

  @Autowired
  public ProgramaController(ProgramaService programaService) {
    this.programaService = programaService;
  }

  @GetMapping
  public List<Programa> findAll() {
    return programaService.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Programa> findById(@PathVariable Long id) {
    return programaService.findById(id);
  }

  @PostMapping
  public Programa save(@RequestBody Programa programa) {
    return programaService.save(programa);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    programaService.deleteById(id);
  }
}
