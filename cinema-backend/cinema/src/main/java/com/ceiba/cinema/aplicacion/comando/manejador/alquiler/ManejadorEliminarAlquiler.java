package com.ceiba.cinema.aplicacion.comando.manejador.alquiler;

import com.ceiba.cinema.dominio.servicios.alquiler.ServicioEliminarAlquiler;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarAlquiler {

    private final ServicioEliminarAlquiler eliminarAlquiler;

    public ManejadorEliminarAlquiler(ServicioEliminarAlquiler eliminarAlquiler) {
        this.eliminarAlquiler = eliminarAlquiler;
    }

    public void ejecutar(Integer idAlquiler){
        this.eliminarAlquiler.ejecutar(idAlquiler);
    }
}
