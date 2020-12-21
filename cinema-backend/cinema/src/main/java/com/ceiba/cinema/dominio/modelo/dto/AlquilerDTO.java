package com.ceiba.cinema.dominio.modelo.dto;


import java.time.LocalDateTime;

public class AlquilerDTO {

    private Integer idAlquilerDTO;
    private ClienteDTO clienteDTO;
    private PeliculaDTO peliculaDTO;
    private LocalDateTime fechaDTO;
    private Double valorTotalDTO;

    public AlquilerDTO(){
        super();
    }

    public Integer getIdAlquilerDTO() {
        return idAlquilerDTO;
    }

    public void setIdAlquilerDTO(Integer idAlquilerDTO) {
        this.idAlquilerDTO = idAlquilerDTO;
    }

    public ClienteDTO getClienteDTO() {
        return clienteDTO;
    }

    public void setClienteDTO(ClienteDTO clienteDTO) {
        this.clienteDTO = clienteDTO;
    }

    public PeliculaDTO getPeliculaDTO() {
        return peliculaDTO;
    }

    public void setPeliculaDTO(PeliculaDTO peliculaDTO) {
        this.peliculaDTO = peliculaDTO;
    }

    public LocalDateTime getFechaDTO() {
        return fechaDTO;
    }

    public void setFechaDTO(LocalDateTime fechaDTO) {
        this.fechaDTO = fechaDTO;
    }

    public Double getValorTotalDTO() {
        return valorTotalDTO;
    }

    public void setValorTotalDTO(Double valorTotalDTO) {
        this.valorTotalDTO = valorTotalDTO;
    }
}
