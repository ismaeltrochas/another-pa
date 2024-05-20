package com.proyectoaulas.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFinalizacion;
    @ManyToOne
    @JoinColumn(name = "programa_id")
    private Programa programa;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User userId;
}
