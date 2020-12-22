package com.ceiba.cinema.dominio.servicios.alquiler;

import com.ceiba.cinema.dominio.modelo.Alquiler;
import com.ceiba.cinema.dominio.modelo.dto.ClienteDTO;
import com.ceiba.cinema.dominio.modelo.dto.PeliculaDTO;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioAlquiler;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;

public class ServicioCrearAlquiler {

    private RepositorioAlquiler repositorioAlquiler;
    private RepositorioCliente repositorioCliente;
    private RepositorioPelicula repositorioPelicula;

    public ServicioCrearAlquiler(RepositorioAlquiler repositorioAlquiler,
                                 RepositorioCliente repositorioCliente,
                                 RepositorioPelicula repositorioPelicula){
        this.repositorioAlquiler = repositorioAlquiler;
        this.repositorioCliente = repositorioCliente;
        this.repositorioPelicula = repositorioPelicula;
    }

    public void ejecutar(Alquiler alquiler){

        ClienteDTO clienteDTO = repositorioCliente.buscarClientePorId(alquiler.getCliente().getIdCliente());
        PeliculaDTO peliculaDTO = repositorioPelicula.buscarPeliculaPorId(alquiler.getPelicula().getIdPelicula());
        alquiler.setCliente(clienteDTO.construir());
        alquiler.setPelicula(peliculaDTO.construir());
        this.repositorioAlquiler.crearAlquiler(alquiler);

    }


}
