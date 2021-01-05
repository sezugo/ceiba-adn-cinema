package com.ceiba.cinema.dominio.servicios.cliente;

import com.ceiba.cinema.dominio.excepcion.ExcepcionGeneral;
import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.cinema.testdatabuilder.ClienteTestDataBuilder;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

public class ServicioActualizarClienteTest {

    private static final String EL_CLIENTE_NO_EXISTE = "El cliente no existe";

    public ServicioActualizarCliente servicioActualizarCliente;
    public RepositorioCliente repositorioCliente;

    public void errorActualizarClienteTest(){
        //Arrange
        repositorioCliente = Mockito.mock(RepositorioCliente.class);
        servicioActualizarCliente = new ServicioActualizarCliente(repositorioCliente);
        Cliente cliente = new ClienteTestDataBuilder().build();

        //Act - Assert
        try {
            servicioActualizarCliente.ejecutar(cliente);
        }
        catch (ExcepcionGeneral e){
            Assertions.assertEquals(EL_CLIENTE_NO_EXISTE, e.getMessage());
        }



    }









}
