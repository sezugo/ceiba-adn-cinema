package com.ceiba.cinema.dominio;

import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.testdatabuilder.ClienteTestDataBuilder;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ClienteTest {


    private static final String VALOR_VACIO = " ";


    @Test
    void crearCliente() {
        //Arrange
        Cliente cliente = new ClienteTestDataBuilder().build();

        //Act - Assert
        Assert.assertNotNull(cliente);
    }


}
