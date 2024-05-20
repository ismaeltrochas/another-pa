package com.proyectoaulas.demo.repository;

import com.proyectoaulas.demo.entity.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  Optional<User> findByEmailAndContrasenia(String email, String password);

}
