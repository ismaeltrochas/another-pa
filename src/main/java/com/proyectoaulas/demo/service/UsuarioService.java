package com.proyectoaulas.demo.service;

import com.proyectoaulas.demo.entity.User;
import com.proyectoaulas.demo.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

  private final UserRepository repository;

  @Autowired
  public UsuarioService(UserRepository repository) {
    this.repository = repository;
  }

  public User loginUser(String email, String password) {
    return repository.findByEmailAndContrasenia(email, password).orElse(null);
  }

  public List<User> findAll() {
    return repository.findAll();
  }

  public Optional<User> findById(Long id) {
    return repository.findById(id);
  }

  public User save(User entity) {
    return repository.save(entity);
  }

  public void deleteById(Long id) {
    repository.deleteById(id);
  }
}
