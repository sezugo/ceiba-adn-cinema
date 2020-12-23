package com.ceiba.cinema.infraestructura.repositoriojpa;


import com.ceiba.cinema.infraestructura.entidades.AlquilerEntidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface RepositorioAlquilerJpa extends JpaRepository<AlquilerEntidad, Serializable> {


}
