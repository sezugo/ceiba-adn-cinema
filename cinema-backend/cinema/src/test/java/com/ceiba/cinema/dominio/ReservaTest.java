package com.ceiba.cinema.dominio;

import com.ceiba.cinema.dominio.excepcion.ExcepcionObligatorio;
import com.ceiba.cinema.dominio.modelo.Reserva;
import com.ceiba.cinema.testdatabuilder.ReservaTestDataBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class ReservaTest {

    private static final String VALOR_VACIO = " ";

    @Test
    public void crearReserva() {
        //Arrange
        Reserva reserva = new ReservaTestDataBuilder().build();

        //Act - Assert
        Assert.assertNotNull(reserva);
    }


    public void validarFecha(){
        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, () ->{
            new ReservaTestDataBuilder().conFecha(null).build();
        }, "Debe haber una fecha de entrega");
    }


    public void validarPrecio(){
        //Arrange - Act - Assert
        Assertions.assertThrows(ExcepcionObligatorio.class, () ->{
            new ReservaTestDataBuilder().conValorTotal(null).build();
        }, "Debe haber un precio de reserva");
    }


}
