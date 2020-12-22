package com.ceiba.cinema.dominio.servicios.pelicula;

import com.ceiba.cinema.dominio.modelo.dto.PeliculaDTO;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;

public class ServicioEliminarPelicula {

    private RepositorioPelicula repositorioPelicula;

    public ServicioEliminarPelicula(RepositorioPelicula repositorioPelicula){
        this.repositorioPelicula = repositorioPelicula;
    }

    public void ejecutar(String nombrePelicula){
        PeliculaDTO peliculaDTO = repositorioPelicula.buscarPeliculaPorNombre(nombrePelicula);
        this.repositorioPelicula.eliminarPelicula(peliculaDTO.getIdPeliculaDTO());
    }

}
