package com.ceiba.cinema.dominio.puerto.repositorio;


import com.ceiba.cinema.dominio.modelo.Reserva;

import java.util.List;

public interface RepositorioReserva {

    void crearReserva(Reserva reserva);
    void eliminarReserva(Integer idAlquiler);
    List<Reserva> listarReserva();


}
