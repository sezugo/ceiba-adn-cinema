package com.ceiba.cinema.aplicacion.comando.manejador.reserva;

import com.ceiba.cinema.dominio.servicios.reserva.ServicioEliminarReserva;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarReserva {

    private final ServicioEliminarReserva eliminarAlquiler;

    public ManejadorEliminarReserva(ServicioEliminarReserva eliminarReserva) {
        this.eliminarAlquiler = eliminarReserva;
    }

    public void ejecutar(Integer idReserva){
        this.eliminarAlquiler.ejecutar(idReserva);
    }
}
