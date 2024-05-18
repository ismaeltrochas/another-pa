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
@Table(name = "ENCUESTAS")
public class Encuesta {

    private Long id;
    private LocalDateTime fechaCreacion;
    private String descripcion;
    private String pregunta;
    private User user;

}
