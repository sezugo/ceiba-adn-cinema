package com.ceiba.cinema.infraestructura.configuracion;

import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;
import com.ceiba.cinema.dominio.servicios.reserva.ServicioCrearReserva;
import com.ceiba.cinema.dominio.servicios.reserva.ServicioEliminarReserva;
import com.ceiba.cinema.dominio.servicios.reserva.ServicioListarReserva;
import org.springframework.context.annotation.Bean;

//@Configuration
public class BeanServicioAlquiler {

    @Bean
    public ServicioCrearReserva servicioCrearAlquiler(RepositorioReserva repositorioReserva,
                                                      RepositorioCliente repositorioCliente,
                                                      RepositorioPelicula repositorioPelicula){
        return new ServicioCrearReserva(repositorioReserva, repositorioCliente, repositorioPelicula);
    }

    @Bean
    public ServicioEliminarReserva servicioEliminarAlquiler(RepositorioReserva repositorioReserva){
        return new ServicioEliminarReserva(repositorioReserva);
    }

    @Bean
    public ServicioListarReserva servicioListarAlquiler(RepositorioReserva repositorioReserva){
        return new ServicioListarReserva(repositorioReserva);
    }

}
