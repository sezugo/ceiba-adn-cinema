package com.ceiba.cinema.dominio.unitaria;

import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.testdatabuilder.dominio.modelo.ClienteTestDataBuilder;
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

}
