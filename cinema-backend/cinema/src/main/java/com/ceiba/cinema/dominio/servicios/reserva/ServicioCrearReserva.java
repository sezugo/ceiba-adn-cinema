package com.ceiba.cinema.dominio.servicios.reserva;
import com.ceiba.cinema.dominio.modelo.Reserva;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;

public class ServicioCrearReserva {

    private RepositorioReserva repositorioReserva;


    public ServicioCrearReserva(RepositorioReserva repositorioReserva){
        this.repositorioReserva = repositorioReserva;

    }

    public void ejecutar(Reserva reserva){

        //VALIDAR LOGICA NEGOCIO
        this.repositorioReserva.crearReserva(reserva);

    }


}
