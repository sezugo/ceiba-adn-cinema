package com.ceiba.cinema.aplicacion.consulta.manejador.cliente;

import com.ceiba.cinema.dominio.modelo.dto.ClienteDTO;
import com.ceiba.cinema.dominio.servicios.cliente.ServicioListarCliente;

import java.util.List;

public class ManejadorListarCliente {

    private final ServicioListarCliente servicioListarCliente;

    public ManejadorListarCliente(ServicioListarCliente servicioListarCliente) {
        this.servicioListarCliente = servicioListarCliente;
    }
    public List<ClienteDTO> ejecutar(){
        return this.servicioListarCliente.ejecutar();
    }
}
