package com.proyectoaulas.demo.controller;

import com.proyectoaulas.demo.entity.AgendaCita;
import com.proyectoaulas.demo.service.AgendaCitaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agenda-citas")
public class AgendaCitaController {

  private final AgendaCitaService agendaCitaService;

  @Autowired
  public AgendaCitaController(AgendaCitaService agendaCitaService) {
    this.agendaCitaService = agendaCitaService;
  }

  @GetMapping
  public List<AgendaCita> findAll() {
    return agendaCitaService.findAll();
  }

  @GetMapping("/{id}")
  public Optional<AgendaCita> findById(@PathVariable Long id) {
    return agendaCitaService.findById(id);
  }

  @PostMapping
  public AgendaCita save(@RequestBody AgendaCita agendaCita) {
    return agendaCitaService.save(agendaCita);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    agendaCitaService.deleteById(id);
  }

}
