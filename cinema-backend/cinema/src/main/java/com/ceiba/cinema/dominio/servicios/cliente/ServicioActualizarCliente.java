package com.ceiba.cinema.dominio.servicios.cliente;

import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioActualizarCliente {

    private RepositorioCliente repositorioCliente;

    public ServicioActualizarCliente (RepositorioCliente repositorioCliente){
        this.repositorioCliente = repositorioCliente;
    }

    public void ejecutar(Cliente cliente){
        if(repositorioCliente.clienteYaExiste(cliente)){
            this.repositorioCliente.actualizarCliente(cliente);
        }
    }


}
