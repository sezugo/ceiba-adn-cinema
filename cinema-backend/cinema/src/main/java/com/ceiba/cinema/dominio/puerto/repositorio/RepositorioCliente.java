package com.ceiba.cinema.dominio.puerto.repositorio;

import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.modelo.dto.ClienteDTO;

import java.util.List;

public interface RepositorioCliente {

    void crearCliente(Cliente cliente);
    List<ClienteDTO> listarClientes();
    void actualizarCliente(Cliente cliente);
    void eliminarCliente(Integer idCliente);
    ClienteDTO buscarClientePorId(Integer idCliente);
    ClienteDTO buscarClientePorCedula(String cedula);
    boolean clienteYaExiste(Cliente cliente);


}
