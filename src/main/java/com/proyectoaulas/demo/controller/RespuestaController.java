package com.proyectoaulas.demo.controller;
import com.proyectoaulas.demo.entity.Respuesta;
import com.proyectoaulas.demo.service.RespuestaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/respuestas")
public class RespuestaController {

  private final RespuestaService respuestaService;

  @Autowired
  public RespuestaController(RespuestaService respuestaService) {
    this.respuestaService = respuestaService;
  }

  @GetMapping
  public List<Respuesta> findAll() {
    return respuestaService.findAll();
  }

  @GetMapping("/{id}")
  public Optional<Respuesta> findById(@PathVariable Long id) {
    return respuestaService.findById(id);
  }

  @PostMapping
  public Respuesta save(@RequestBody Respuesta respuesta) {
    return respuestaService.save(respuesta);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    respuestaService.deleteById(id);
  }
}
