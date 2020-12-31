package com.ceiba.cinema.dominio;

import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.testdatabuilder.ClienteTestDataBuilder;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTest {

    private static final Integer ID_CLIENTE = 1;
    private static final String NOMBRE = "Peter";
    private static final String APELLIDO = "Parker";
    private static final String CEDULA = "1000400700";
    private static final String CELULAR = "3135811244";
    private static final String DIRECCION = "CL 3 # 33 - 13";
    private static final String CORREO = "peterparker@marvel.com";


    @Test
    void crearClienteConNombre() {
        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder().conNombre(NOMBRE);

        //Act
        Cliente cliente = clienteTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(NOMBRE, cliente.getNombre());
    }

    @Test
    void crearClienteConApellido(){
        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder().conApellido(APELLIDO);

        //Act
        Cliente cliente = clienteTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(APELLIDO, cliente.getApellido());

    }


    @Test
    void crearClienteConCedula(){
        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder().conCedula(CEDULA);

        //Act
        Cliente cliente = clienteTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(CEDULA, cliente.getCedula());

    }

    @Test
    void crearClienteConCelular(){
        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder().conCelular(CELULAR);

        //Act
        Cliente cliente = clienteTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(CELULAR, cliente.getCelular());

    }

    @Test
    void crearClienteConDireccion(){
        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder().conDireccion(DIRECCION);

        //Act
        Cliente cliente = clienteTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(DIRECCION, cliente.getDirrecion());

    }

    @Test
    void crearClienteConCorreo(){
        //Arrange
        ClienteTestDataBuilder clienteTestDataBuilder = new ClienteTestDataBuilder().conCorreo(CORREO);

        //Act
        Cliente cliente = clienteTestDataBuilder.build();

        //Assert
        Assertions.assertEquals(CORREO, cliente.getCorreo());

    }





}
