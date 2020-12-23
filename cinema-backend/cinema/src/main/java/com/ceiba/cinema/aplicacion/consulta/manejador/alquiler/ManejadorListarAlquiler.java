package com.ceiba.cinema.aplicacion.consulta.manejador.alquiler;


import com.ceiba.cinema.dominio.modelo.dto.AlquilerDTO;
import com.ceiba.cinema.dominio.servicios.alquiler.ServicioListarAlquiler;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarAlquiler {

    private final ServicioListarAlquiler servicioListarAlquiler;

    public ManejadorListarAlquiler(ServicioListarAlquiler servicioListarAlquiler) {
        this.servicioListarAlquiler = servicioListarAlquiler;
    }

    public List<AlquilerDTO> ejecutar(){
        return this.servicioListarAlquiler.ejecutar();
    }

}
