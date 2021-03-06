package com.ceiba.cinema.dominio.servicios.reserva;

import com.ceiba.cinema.dominio.modelo.Reserva;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioReserva;

import java.util.List;

public class ServicioListarReserva {

    private RepositorioReserva repositorioReserva;

    public ServicioListarReserva(RepositorioReserva repositorioReserva){
        this.repositorioReserva = repositorioReserva;
    }

    public List<Reserva> ejecutar(){
        return this.repositorioReserva.listarReserva();
    }

}
