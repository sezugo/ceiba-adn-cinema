package com.ceiba.cinema.aplicacion.comando.manejador.alquiler;

import com.ceiba.cinema.aplicacion.comando.ComandoAlquiler;
import com.ceiba.cinema.aplicacion.comando.fabrica.FabricaAlquiler;
import com.ceiba.cinema.aplicacion.comando.fabrica.FabricaPelicula;
import com.ceiba.cinema.dominio.modelo.Alquiler;
import com.ceiba.cinema.dominio.servicios.alquiler.ServicioCrearAlquiler;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearAlquiler {

    private final ServicioCrearAlquiler servicioCrearAlquiler;
    private final FabricaAlquiler fabricaAlquiler;

    public ManejadorCrearAlquiler(ServicioCrearAlquiler servicioCrearAlquiler, FabricaAlquiler fabricaAlquiler) {
        this.servicioCrearAlquiler = servicioCrearAlquiler;
        this.fabricaAlquiler = fabricaAlquiler;
    }

    //mandar los dos parametros del comando pelicula y cliente
    public void ejecutar (ComandoAlquiler comandoAlquiler){
        Alquiler alquiler = this.fabricaAlquiler.crear(comandoAlquiler);
        this.servicioCrearAlquiler.ejecutar(alquiler);
    }


}
