package com.ceiba.cinema.infraestructura.adaptador.repositorio;

import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.cinema.infraestructura.convertir.cliente.ConvertirCliente;
import com.ceiba.cinema.infraestructura.entidades.ClienteEntidad;
import com.ceiba.cinema.infraestructura.repositoriojpa.RepositorioClienteJpa;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class RepositorioClientePostgres implements RepositorioCliente {

    private RepositorioClienteJpa repositorioClienteJpa;
    private ConvertirCliente convertirCliente;

    public RepositorioClientePostgres(RepositorioClienteJpa repositorioClienteJpa,ConvertirCliente convertirCliente){
        this.repositorioClienteJpa = repositorioClienteJpa;
        this.convertirCliente = convertirCliente;
    }

    @Override
    public void crearCliente(Cliente cliente){
        ClienteEntidad clienteEntidadCrear = convertirCliente.convertirCLienteDominioAClienteEntidad(cliente);
        repositorioClienteJpa.save(clienteEntidadCrear);
    }

    @Override
    public List<Cliente> listarClientes(){
        List<ClienteEntidad> listaClienteEntidad = repositorioClienteJpa.findAll();
        List<Cliente> listaCliente = new ArrayList<>();
        return convertirCliente.convertirListaCLienteEntidadAListarCliente(listaClienteEntidad, listaCliente);
    }


    @Override
    public void actualizarCliente(Cliente cliente){
        ClienteEntidad clienteEntidadActualizar = convertirCliente.convertirCLienteDominioAClienteEntidad(cliente);
        repositorioClienteJpa.save(clienteEntidadActualizar);
    }

    @Override
    public void eliminarCliente(Integer idCliente){
        repositorioClienteJpa.deleteById(idCliente);
    }

    @Override
    public boolean clienteYaExiste(Cliente cliente){
        String cedulaCliente = cliente.getCedula();
        return (repositorioClienteJpa.findByCedula(cedulaCliente)) != null;
    }

    public Cliente buscarPorCedula(String cedula){
        ClienteEntidad clienteEntidad = repositorioClienteJpa.findByCedula(cedula);
        return (clienteEntidad == null ? null : convertirCliente.convertirClienteEntidadADominio(clienteEntidad));
    }

    /*
    @Override
    public ClienteDTO buscarClientePorId(Integer idCliente){
        ClienteEntidad clienteEntidad = repositorioClienteJpa.findById(idCliente).orElse(null);
        if(clienteEntidad != null){
            return convertirCliente.convertirClienteEntidadAClienteDTO(clienteEntidad);
        }
        else {
            return null;
        }
    }

    @Override
    public ClienteDTO buscarClientePorCedula(String cedula){
        ClienteEntidad clienteEntidad = repositorioClienteJpa.findByCedula(cedula);
        if(clienteEntidad != null){
            return convertirCliente.convertirClienteEntidadAClienteDTO(clienteEntidad);
        }
        else {
            return null;
        }
    }
    */

}
