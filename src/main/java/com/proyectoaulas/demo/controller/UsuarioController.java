package com.proyectoaulas.demo.controller;

import com.proyectoaulas.demo.entity.User;
import com.proyectoaulas.demo.service.UsuarioService;
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
@RequestMapping("/usuarios")
public class UsuarioController {

  private final UsuarioService respuestaService;

  @Autowired
  public UsuarioController(UsuarioService respuestaService) {
    this.respuestaService = respuestaService;
  }

  @GetMapping("/{username}/{password}")
  public User findById(@PathVariable String username, @PathVariable String password) {
    return respuestaService.loginUser(username, password);
  }

  @GetMapping
  public List<User> findAll() {
    return respuestaService.findAll();
  }

  @GetMapping("/{id}")
  public Optional<User> findById(@PathVariable Long id) {
    return respuestaService.findById(id);
  }

  @PostMapping
  public User save(@RequestBody User respuesta) {
    return respuestaService.save(respuesta);
  }

  @DeleteMapping("/{id}")
  public void deleteById(@PathVariable Long id) {
    respuestaService.deleteById(id);
  }
}
