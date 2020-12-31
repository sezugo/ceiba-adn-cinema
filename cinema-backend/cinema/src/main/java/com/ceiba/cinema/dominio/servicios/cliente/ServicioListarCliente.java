package com.ceiba.cinema.dominio.servicios.cliente;

import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;

import java.util.List;

public class ServicioListarCliente {

    private RepositorioCliente repositorioCliente;

    public ServicioListarCliente(RepositorioCliente repositorioCliente){
        this.repositorioCliente = repositorioCliente;
    }

    public List<Cliente> ejecutar(){
        return this.repositorioCliente.listarClientes();
    }


}
