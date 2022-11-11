package com.akzio.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.akzio.modelo.encuesta;

@Repository
public interface encuestaRepositorio extends JpaRepository<encuesta, Integer> {

}
