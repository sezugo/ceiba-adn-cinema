package com.ceiba.cinema.dominio.puerto.repositorio;


import com.ceiba.cinema.dominio.modelo.Reserva;
import com.ceiba.cinema.dominio.modelo.dto.AlquilerDTO;

import java.util.List;

public interface RepositorioReserva {

    void crearReserva(Reserva reserva);
    void eliminarAlquiler(Integer idAlquiler);
    List<Reserva> listarReserva();


}
