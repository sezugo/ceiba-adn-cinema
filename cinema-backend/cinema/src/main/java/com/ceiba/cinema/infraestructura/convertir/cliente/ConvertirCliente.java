package com.ceiba.cinema.infraestructura.convertir.cliente;

import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.infraestructura.entidades.ClienteEntidad;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConvertirCliente {

    private ModelMapper modelMapper = new ModelMapper();

    public ClienteEntidad convertirDominioPorEntidad(Cliente cliente){
        return modelMapper.map(cliente, ClienteEntidad.class);
    }

    public Cliente convertirClienteEntidadADominio(ClienteEntidad clienteEntidad){
        return modelMapper.map(clienteEntidad, Cliente.class);
    }

    public List<Cliente> convertirListaClienteEntidadAListarCliente(List<ClienteEntidad> listaClienteEntidad, List<Cliente> listaCliente){
        for(ClienteEntidad clienteEntidad: listaClienteEntidad){
            Cliente cliente = modelMapper.map(clienteEntidad, Cliente.class);
            listaCliente.add(cliente);
        }
        return listaCliente;
    }


}
