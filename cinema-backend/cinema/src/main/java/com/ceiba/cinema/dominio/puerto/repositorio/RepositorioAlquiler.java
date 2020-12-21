package com.ceiba.cinema.dominio.puerto.repositorio;


import com.ceiba.cinema.dominio.modelo.Alquiler;
import com.ceiba.cinema.dominio.modelo.dto.AlquilerDTO;

import java.util.List;

public interface RepositorioAlquiler {

    void crearAlquiler(Alquiler alquiler);
    void eliminarAlquiler(Integer idAlquiler);
    List<AlquilerDTO> listarAlquiler();


}
