package com.ceiba.cinema.dominio.servicios.cliente;

import com.ceiba.cinema.dominio.modelo.dto.ClienteDTO;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioEliminarCliente {

    private RepositorioCliente repositorioCliente;

    public ServicioEliminarCliente (RepositorioCliente repositorioCliente){
        this.repositorioCliente = repositorioCliente;
    }

    public void ejecutar(String cedula){
        ClienteDTO clienteDTO = repositorioCliente.buscarClientePorCedula(cedula);
        this.repositorioCliente.eliminarCliente(clienteDTO.getIdClienteDTO());
    }



}
