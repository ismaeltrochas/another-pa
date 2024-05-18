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
@Table(name = "AGENDA_CITA")
public class AgendaCita {

    private Long id;
    private String descripcion;
    private LocalDateTime fechaDeAgenda;
    private User user;


}
