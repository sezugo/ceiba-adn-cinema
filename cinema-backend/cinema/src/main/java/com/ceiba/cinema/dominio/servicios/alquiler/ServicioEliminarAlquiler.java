package com.ceiba.cinema.dominio.servicios.alquiler;

import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioAlquiler;

public class ServicioEliminarAlquiler {

    private final RepositorioAlquiler repositorioAlquiler;

    public ServicioEliminarAlquiler(RepositorioAlquiler repositorioAlquiler){
        this.repositorioAlquiler = repositorioAlquiler;
    }

    public void ejecutar(Integer idAlquiler){
        this.repositorioAlquiler.eliminarAlquiler(idAlquiler);
    }
}
