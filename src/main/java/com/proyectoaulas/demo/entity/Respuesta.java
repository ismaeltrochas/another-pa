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
@Table(name = "RESPUESTAS")
public class Respuesta {

    private Long id;
    private String respuesta;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaRespuesta;
    private String estado;

}
