package com.ceiba.cinema.dominio.puerto.repositorio;

import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.dominio.modelo.dto.PeliculaDTO;

import java.util.List;

public interface RepositorioPelicula {

    void crearPelicula(Pelicula pelicula);
    List<PeliculaDTO> listarPeliculas();
    void actualizarPelicula(Pelicula pelicula);
    void eliminarPelicula(Pelicula pelicula);
    PeliculaDTO buscarPeliculaPorId(Integer idPelicula);
    PeliculaDTO buscarPeliculaPorNombre(String nombrePelicula);
    boolean peliculaYaExiste(Pelicula pelicula);


}
