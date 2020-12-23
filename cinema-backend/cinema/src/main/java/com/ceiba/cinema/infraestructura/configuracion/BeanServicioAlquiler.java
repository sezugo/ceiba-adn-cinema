package com.ceiba.cinema.infraestructura.configuracion;

import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioAlquiler;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;
import com.ceiba.cinema.dominio.servicios.alquiler.ServicioCrearAlquiler;
import com.ceiba.cinema.dominio.servicios.alquiler.ServicioEliminarAlquiler;
import com.ceiba.cinema.dominio.servicios.alquiler.ServicioListarAlquiler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class BeanServicioAlquiler {

    @Bean
    public ServicioCrearAlquiler servicioCrearAlquiler(RepositorioAlquiler repositorioAlquiler,
                                                       RepositorioCliente repositorioCliente,
                                                       RepositorioPelicula repositorioPelicula){
        return new ServicioCrearAlquiler(repositorioAlquiler, repositorioCliente, repositorioPelicula);
    }

    @Bean
    public ServicioEliminarAlquiler servicioEliminarAlquiler(RepositorioAlquiler repositorioAlquiler){
        return new ServicioEliminarAlquiler(repositorioAlquiler);
    }

    @Bean
    public ServicioListarAlquiler servicioListarAlquiler(RepositorioAlquiler repositorioAlquiler){
        return new ServicioListarAlquiler(repositorioAlquiler);
    }

}
