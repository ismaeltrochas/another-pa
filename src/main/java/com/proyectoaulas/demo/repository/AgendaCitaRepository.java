package com.proyectoaulas.demo.repository;

import com.proyectoaulas.demo.entity.AgendaCita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaCitaRepository extends JpaRepository<AgendaCita, Long> {
}
