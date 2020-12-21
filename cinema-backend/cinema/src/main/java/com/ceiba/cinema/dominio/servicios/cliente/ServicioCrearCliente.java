package com.ceiba.cinema.dominio.servicios.cliente;

import com.ceiba.cinema.dominio.excepcion.Excepciones;
import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;

public class ServicioCrearCliente {

    private RepositorioCliente repositorioCliente;

    public ServicioCrearCliente(RepositorioCliente repositorioCliente){
        this.repositorioCliente = repositorioCliente;
    }

    public boolean ejecutar(Cliente cliente){
        if(repositorioCliente.clienteYaExiste(cliente)){
            throw new Excepciones(Excepciones.El_CLIENTE_YA_EXISTE);
        }
        else{
            this.repositorioCliente.crearCliente(cliente);
            return true;
        }
    }

}
