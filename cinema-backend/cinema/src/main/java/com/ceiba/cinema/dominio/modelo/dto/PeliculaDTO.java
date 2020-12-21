package com.ceiba.cinema.dominio.modelo.dto;

import com.ceiba.cinema.dominio.modelo.Pelicula;

public class PeliculaDTO {

    private Integer idPeliculaDTO;
    private String nombreDTO;
    private String categoriaDTO;
    private String publicadaDTO;
    private Double valorDTO;


    public PeliculaDTO(Integer idPeliculaDTO, String nombreDTO, String categoriaDTO, String publicadaDTO, Double valorDTO){
        super();
        this.idPeliculaDTO = idPeliculaDTO;
        this.nombreDTO = nombreDTO;
        this.categoriaDTO = categoriaDTO;
        this.publicadaDTO = publicadaDTO;
        this.valorDTO = valorDTO;
    }

    public PeliculaDTO(){

    }

    public Integer getIdPeliculaDTO() {
        return idPeliculaDTO;
    }

    public void setIdPeliculaDTO(Integer idPeliculaDTO) {
        this.idPeliculaDTO = idPeliculaDTO;
    }

    public String getNombreDTO() {
        return nombreDTO;
    }

    public void setNombreDTO(String nombreDTO) {
        this.nombreDTO = nombreDTO;
    }

    public String getCategoriaDTO() {
        return categoriaDTO;
    }

    public void setCategoriaDTO(String categoriaDTO) {
        this.categoriaDTO = categoriaDTO;
    }

    public String getPublicadaDTO() {
        return publicadaDTO;
    }

    public void setPublicadaDTO(String publicadaDTO) {
        this.publicadaDTO = publicadaDTO;
    }

    public Double getValorDTO() {
        return valorDTO;
    }

    public void setValorDTO(Double valorDTO) {
        this.valorDTO = valorDTO;
    }

    public Pelicula construir(){
        return new Pelicula(this.idPeliculaDTO, this.nombreDTO, this.categoriaDTO, this.publicadaDTO, this.valorDTO);
    }
}
