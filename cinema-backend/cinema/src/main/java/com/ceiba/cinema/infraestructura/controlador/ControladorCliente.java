package com.ceiba.cinema.infraestructura.controlador;

import com.ceiba.cinema.aplicacion.comando.manejador.cliente.ManejadorActualizarCliente;
import com.ceiba.cinema.aplicacion.comando.manejador.cliente.ManejadorCrearCliente;
import com.ceiba.cinema.aplicacion.comando.manejador.cliente.ManejadorEliminarCliente;
import com.ceiba.cinema.aplicacion.consulta.manejador.cliente.ManejadorListarCliente;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/cliente")

public class ControladorCliente {

    private final ManejadorCrearCliente manejadorCrearCliente;
    private final ManejadorListarCliente manejadorListarCliente;
    private final ManejadorActualizarCliente manejadorActualizarCliente;
    private final ManejadorEliminarCliente manejadorEliminarCliente;


    public ControladorCliente(ManejadorCrearCliente manejadorCrearCliente, ManejadorListarCliente manejadorListarCliente, ManejadorActualizarCliente manejadorActualizarCliente, ManejadorEliminarCliente manejadorEliminarCliente) {
        this.manejadorCrearCliente = manejadorCrearCliente;
        this.manejadorListarCliente = manejadorListarCliente;
        this.manejadorActualizarCliente = manejadorActualizarCliente;
        this.manejadorEliminarCliente = manejadorEliminarCliente;
    }






}
