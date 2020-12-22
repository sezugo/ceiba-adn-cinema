package com.ceiba.cinema.testdatabuilder.dominio.modelo;

import com.ceiba.cinema.dominio.modelo.Cliente;

public class ClienteTestDataBuilder {

    private static final Integer ID_CLIENTE = 1;
    private static final String NOMBRE = "Peter";
    private static final String APELLIDO = "Parker";
    private static final String CEDULA = "1000400700";
    private static final String CELULAR = "3135811244";
    private static final String DIRECCION = "CL 3 # 33 - 13";
    private static final String CORREO = "peterparker@marvel.com";

    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String cedula;
    private String celular;
    private String dirrecion;
    private String correo;

    public ClienteTestDataBuilder(){
        this.idCliente = ID_CLIENTE;
        this.nombre = NOMBRE;
        this.apellido = APELLIDO;
        this.cedula = CEDULA;
        this.celular = CELULAR;
        this.dirrecion = DIRECCION;
        this.correo = CORREO;
    }

    public ClienteTestDataBuilder conNombre(String nombre){
        this.nombre = nombre;
        return this;
    }

    public Cliente build(){
        return new Cliente(this.idCliente, this.nombre, this.apellido, this.cedula, this.celular,
                this.dirrecion, this.correo);
    }







}
