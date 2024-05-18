package com.proyectoaulas.demo.service;

import com.proyectoaulas.demo.dao.IAgendaCitaDao;
import com.proyectoaulas.demo.entity.AgendaCita;
import com.proyectoaulas.demo.repository.AgendaCitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AgendaCitaService implements IAgendaCitaDao {
    @Autowired
    private AgendaCitaRepository repository;

    public List<AgendaCita> findAll() {
        return repository.findAll();
    }

    public Optional<AgendaCita> findById(Long id) {
        return repository.findById(id);
    }

    public AgendaCita save(AgendaCita agendaCita) {
        return repository.save(agendaCita);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
