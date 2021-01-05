package com.ceiba.cinema.dominio.servicios.reserva;
import com.ceiba.cinema.dominio.modelo.Reserva;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioReserva;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioCliente;
import com.ceiba.cinema.dominio.puerto.repositorio.RepositorioPelicula;
import com.ceiba.cinema.dominio.validar.ValidarLogicaNegocio;

import java.time.LocalDateTime;

public class ServicioCrearReserva {

    private RepositorioReserva repositorioReserva;
    private ValidarLogicaNegocio validarLogicaNegocio = new ValidarLogicaNegocio();


    public ServicioCrearReserva(RepositorioReserva repositorioReserva){
        this.repositorioReserva = repositorioReserva;

    }

    public void ejecutar(Reserva reserva){
        LocalDateTime fechaActual = LocalDateTime.now();
        validarLogicaNegocio.diaDelMesSinServicio(fechaActual);
        LocalDateTime fechaEntrega = validarLogicaNegocio.calcularFechaEntrega();
        reserva.setFecha(fechaEntrega);
        Double valor = validarLogicaNegocio.calcularValorTotal(reserva.getFecha(), reserva.getPelicula().getValor());
        reserva.setValorTotal(valor);


        //VALIDAR LOGICA NEGOCIO

        this.repositorioReserva.crearReserva(reserva);

    }


}
