package com.proyectoaulas.demo.controller;

import com.proyectoaulas.demo.entity.Cargo;
import com.proyectoaulas.demo.service.CargoService;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cargo")
@RequiredArgsConstructor
public class CargoController {

  private final CargoService cargoService;


  @GetMapping("/{id}")
  public Optional<Cargo> findById(@PathVariable Long id) {
    return cargoService.findById(id);
  }

  @PostMapping
  public Cargo save(@RequestBody Cargo cita) {
    return cargoService.save(cita);
  }


}
