package com.ceiba.cinema.infraestructura.entidades;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "alquiler")
public class AlquilerEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_alquiler")
    private Integer idAlquiler;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private ClienteEntidad cliente;

    @ManyToOne
    @JoinColumn(name = "id_pelicula")
    private PeliculaEntidad pelicula;

    @Column(name = "fecha")
    private LocalDateTime fecha;

    @Column(name = "valor_total")
    private Double valorTotal;

    public AlquilerEntidad(Integer idAlquiler, ClienteEntidad cliente, PeliculaEntidad pelicula, LocalDateTime fecha, Double valorTotal){
        this.idAlquiler = idAlquiler;
        this.cliente = cliente;
        this.pelicula = pelicula;
        this.fecha = fecha;
        this.valorTotal = valorTotal;
    }

    public AlquilerEntidad(){

    }

    public Integer getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(Integer idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public ClienteEntidad getCliente() {
        return cliente;
    }

    public void setCliente(ClienteEntidad cliente) {
        this.cliente = cliente;
    }

    public PeliculaEntidad getPelicula() {
        return pelicula;
    }

    public void setPelicula(PeliculaEntidad pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

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
