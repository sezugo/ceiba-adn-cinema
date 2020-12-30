package com.ceiba.cinema.aplicacion.consulta.manejador.pelicula;

import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.dominio.modelo.dto.PeliculaDTO;
import com.ceiba.cinema.dominio.servicios.pelicula.ServicioListarPelicula;

import java.util.List;

public class ManejadorListarPelicula {

    private final ServicioListarPelicula servicioListarPelicula;

    public ManejadorListarPelicula(ServicioListarPelicula servicioListarPelicula) {
        this.servicioListarPelicula = servicioListarPelicula;
    }

    public List<Pelicula> ejecutar(){
        return this.servicioListarPelicula.ejecutar();
    }

}
