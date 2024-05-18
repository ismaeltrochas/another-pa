package com.proyectoaulas.demo.dao;

import com.proyectoaulas.demo.entity.User;

import java.util.List;
import java.util.Optional;

public interface IUserDao {

    List<User> findAll();

    Optional<User> findById(Long id);

    User save(User entity);

    void deleteById(User id);
}
