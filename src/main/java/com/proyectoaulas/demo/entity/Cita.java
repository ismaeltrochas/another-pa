package com.proyectoaulas.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "CITAS")
public class Cita {
    private Long id;
    private String descripcion;
    private LocalDateTime fechaDeCita;
    private LocalDateTime fechaCreacion;
    private String estado;
}
