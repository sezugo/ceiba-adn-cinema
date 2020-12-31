package com.ceiba.cinema.dominio;

import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.testdatabuilder.PeliculaTestDataBuilder;
import org.junit.Assert;
import org.junit.Test;

public class PeliculaTest {

    private static final String VALOR_VACIO = " ";

    @Test
    public void crearPelicula(){
        //Arrange
        Pelicula pelicula = new PeliculaTestDataBuilder().build();

        //Act - Assert
        Assert.assertNotNull(pelicula);
    }



}
