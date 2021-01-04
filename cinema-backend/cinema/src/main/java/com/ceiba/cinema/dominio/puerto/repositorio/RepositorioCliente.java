package com.ceiba.cinema.dominio.puerto.repositorio;

import com.ceiba.cinema.dominio.modelo.Cliente;


import java.util.List;

public interface RepositorioCliente {

    void crearCliente(Cliente cliente);
    List<Cliente> listarClientes();
    void actualizarCliente(Cliente cliente);
    void eliminarCliente(Integer idCliente);
    boolean clienteYaExiste(Cliente cliente);
    Cliente buscarPorCedula(String cedula);

}
