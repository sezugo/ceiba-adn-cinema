package com.ceiba.cinema.dominio.servicios.cliente;

import com.ceiba.cinema.dominio.excepcion.Excepciones;
import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioActualizarCliente {

    private static final String EL_CLIENTE_NO_EXISTE = "El cliente a actualizar no existe";

    private RepositorioCliente repositorioCliente;

    public ServicioActualizarCliente (RepositorioCliente repositorioCliente){
        this.repositorioCliente = repositorioCliente;
    }

    public void ejecutar(Cliente cliente){
        if(repositorioCliente.clienteYaExiste(cliente)){
            this.repositorioCliente.actualizarCliente(cliente);
        }
        else {
            throw new Excepciones(EL_CLIENTE_NO_EXISTE);
        }
    }


}
