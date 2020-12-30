package com.ceiba.cinema.dominio.modelo;

import com.ceiba.cinema.dominio.validar.ValidarParametro;

import java.time.LocalDateTime;

public class Reserva {


    private static final String SE_DEBE_INGRESAR_EL_CLIENTE_QUE_ALQUILA_LA_PELICULA = "Se debe ingresar el cliente que reserva la pelicula";
    private static final String SE_DEBE_INGRESAR_LA_PELICULA_QUE_SE_VA_RESERVAR = "Se debe ingresar la pelicula que se va reservar";


    private Integer idReserva;
    private Cliente cliente;
    private Pelicula pelicula;
    private LocalDateTime fecha;
    private Double valorTotal;

    public Reserva(Integer idReserva, Cliente cliente, Pelicula pelicula, LocalDateTime fecha, Double valorTotal){

        ValidarParametro.validarObligatorio(cliente, SE_DEBE_INGRESAR_EL_CLIENTE_QUE_ALQUILA_LA_PELICULA);
        ValidarParametro.validarObligatorio(pelicula, SE_DEBE_INGRESAR_LA_PELICULA_QUE_SE_VA_RESERVAR);

        this.idReserva = idReserva;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.valorTotal = valorTotal;

    }

    public Reserva(Integer idReserva, Cliente cliente, Pelicula pelicula) {

        this.idReserva = idReserva;
        this.cliente = cliente;
        this.pelicula = pelicula;



    }

    public Integer getIdAlquiler() {
        return idReserva;
    }

    public void setIdAlquiler(Integer idAlquiler) {
        this.idReserva = idAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    //Observacion
   public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
    //Observacion
    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
