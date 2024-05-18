package com.proyectoaulas.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "USERS")
public class User {

    private Long id;
    private String nombre;
    private String apellido;
    private String correo;
    private String contraseña;
    private Programa programa;
    private AgendaCita agendaCita;
}
