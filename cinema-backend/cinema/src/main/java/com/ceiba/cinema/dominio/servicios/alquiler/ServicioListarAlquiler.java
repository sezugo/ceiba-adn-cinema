package com.ceiba.cinema.dominio.servicios.alquiler;

import com.ceiba.cinema.dominio.modelo.dto.AlquilerDTO;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioAlquiler;

import java.util.List;

public class ServicioListarAlquiler {

    private RepositorioAlquiler repositorioAlquiler;

    public ServicioListarAlquiler(RepositorioAlquiler repositorioAlquiler){
        this.repositorioAlquiler = repositorioAlquiler;
    }

    public List<AlquilerDTO> ejecutar(){
        return this.repositorioAlquiler.listarAlquiler();
    }

}
