package com.ceiba.cinema.dominio.modelo.dto;

import com.ceiba.cinema.dominio.modelo.Cliente;

public class ClienteDTO {

    private Integer idClienteDTO;
    private String nombreDTO;
    private String apellidoDTO;
    private String cedulaDTO;
    private String celularDTO;
    private String dirrecionDTO;
    private String correoDTO;


    public ClienteDTO(Integer idClienteDTO, String nombreDTO, String apellidoDTO, String cedulaDTO, String celularDTO, String direccionDTO, String correoDTO){
        super();
        this.idClienteDTO = idClienteDTO;
        this.nombreDTO = nombreDTO;
        this.apellidoDTO = apellidoDTO;
        this.cedulaDTO = cedulaDTO;
        this.celularDTO = celularDTO;
        this.dirrecionDTO = direccionDTO;
        this.correoDTO = correoDTO;

    }

    public ClienteDTO(){

    }

    public Integer getIdClienteDTO() {
        return idClienteDTO;
    }

    public void setIdClienteDTO(Integer idClienteDTO) {
        this.idClienteDTO = idClienteDTO;
    }

    public String getNombreDTO() {
        return nombreDTO;
    }

    public void setNombreDTO(String nombreDTO) {
        this.nombreDTO = nombreDTO;
    }

    public String getApellidoDTO() {
        return apellidoDTO;
    }

    public void setApellidoDTO(String apellidoDTO) {
        this.apellidoDTO = apellidoDTO;
    }

    public String getCedulaDTO() {
        return cedulaDTO;
    }

    public void setCedulaDTO(String cedulaDTO) {
        this.cedulaDTO = cedulaDTO;
    }

    public String getCelularDTO() {
        return celularDTO;
    }

    public void setCelularDTO(String celularDTO) {
        this.celularDTO = celularDTO;
    }

    public String getDirrecionDTO() {
        return dirrecionDTO;
    }

    public void setDirrecionDTO(String dirrecionDTO) {
        this.dirrecionDTO = dirrecionDTO;
    }

    public String getCorreoDTO() {
        return correoDTO;
    }

    public void setCorreoDTO(String correoDTO) {
        this.correoDTO = correoDTO;
    }

    public Cliente construir(){
        return new Cliente(this.idClienteDTO, this.nombreDTO, this.apellidoDTO, this.cedulaDTO,
                this.celularDTO, this.dirrecionDTO, this.correoDTO);
    }
}
