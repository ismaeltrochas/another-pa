package com.proyectoaulas.demo.service;

import com.proyectoaulas.demo.dao.ICargoDao;
import com.proyectoaulas.demo.entity.Cargo;
import com.proyectoaulas.demo.repository.CargoRepository;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CargoService implements ICargoDao {

  private final CargoRepository repository;

  public List<Cargo> findAll() {
    return repository.findAll();
  }

  public Optional<Cargo> findById(Long id) {
    return repository.findById(id);
  }

  public Cargo save(Cargo cargo) {
    return repository.save(cargo);
  }


  public void deleteById(Long id) {
    repository.deleteById(id);
  }
}
