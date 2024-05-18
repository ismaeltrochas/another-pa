package com.proyectoaulas.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "PROGRAMAS")
public class Programa {

    private Long id;
    private String name;
    private String descripcion;
    private Integer duracion;
    private Integer creditos;
    private List<User> user;
}
