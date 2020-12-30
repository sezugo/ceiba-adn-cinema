package com.ceiba.cinema.dominio.servicios.reserva;
import com.ceiba.cinema.dominio.modelo.Reserva;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;

public class ServicioCrearReserva {

    private RepositorioReserva repositorioReserva;
    private RepositorioCliente repositorioCliente;
    private RepositorioPelicula repositorioPelicula;

    public ServicioCrearReserva(RepositorioReserva repositorioReserva,
                                RepositorioCliente repositorioCliente,
                                RepositorioPelicula repositorioPelicula){
        this.repositorioReserva = repositorioReserva;
        this.repositorioCliente = repositorioCliente;
        this.repositorioPelicula = repositorioPelicula;
    }

    public void ejecutar(Reserva reserva){

        //VALIDAR LOGICA NEGOCIO
        this.repositorioReserva.crearReserva(reserva);

    }


}
