package com.ceiba.cinema.aplicacion.comando;

import com.ceiba.cinema.dominio.modelo.Cliente;
import com.ceiba.cinema.dominio.modelo.Pelicula;

import java.time.LocalDateTime;

public class ComandoAlquiler {

    private Integer idAlquiler;
    private Cliente cliente;
    private Pelicula pelicula;
    private LocalDateTime fecha;
    private Double valorTotal;

    public ComandoAlquiler(Integer idAlquiler, Cliente cliente, Pelicula pelicula, LocalDateTime fecha, Double valorTotal){
        this.idAlquiler = idAlquiler;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.valorTotal = valorTotal;
    }

    public ComandoAlquiler(){

    }

    public Integer getIdAlquiler() {
        return idAlquiler;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Double getValorTotal() {
        return valorTotal;
    }
}
