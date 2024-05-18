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
@Table(name = "PERMANENCIAS")
public class Permanencia {

    private Long id;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFinalizacion;
    private Programa programa;
    private User userId;
}
