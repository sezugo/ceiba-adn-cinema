package com.ceiba.cinema.dominio.servicios.pelicula;


import com.ceiba.cinema.dominio.excepcion.Excepciones;
import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;

public class ServicioCrearPelicula {

    private RepositorioPelicula repositorioPelicula;

    public ServicioCrearPelicula(RepositorioPelicula repositorioPelicula){
        this.repositorioPelicula = repositorioPelicula;
    }

    public void ejecutar(Pelicula pelicula){
        if(repositorioPelicula.peliculaYaExiste(pelicula)){
            throw new Excepciones(Excepciones.LA_PELICULA_YA_EXISTE);
        }
        else{
            this.repositorioPelicula.crearPelicula(pelicula);
        }


    }

}
