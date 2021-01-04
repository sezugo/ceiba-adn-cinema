package com.ceiba.cinema.aplicacion.consulta.manejador.cliente;

import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.servicios.cliente.ServicioListarCliente;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarCliente {

    private final ServicioListarCliente servicioListarCliente;

    public ManejadorListarCliente(ServicioListarCliente servicioListarCliente) {
        this.servicioListarCliente = servicioListarCliente;
    }

    public List<Cliente> ejecutar(){
        return this.servicioListarCliente.ejecutar();
    }

}
