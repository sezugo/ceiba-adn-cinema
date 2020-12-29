package com.ceiba.cinema.dominio.modelo;



public class Cliente {

    private static final String SE_DEBE_INGRESAR_EL_NOMBRE_DEL_CLIENTE = "Se debe ingresar el nombre del cliente";
    private static final String SE_DEBE_INGRESAR_EL_APELLIDO_DEL_CLIENTE = "Se debe ingresar el apellido del cliente";
    private static final String SE_DEBE_INGRESAR_LA_CEDULA_DEL_CLIENTE = "Se debe ingresar el celular del cliente";
    private static final String SE_DEBE_INGRESAR_EL_CELULAR_DE_USUARIO = "Se debe ingresar la cedula del cliente";
    private static final String SE_DEBE_INGRESAR_LA_DIRRECION_DEL_CLIENTE = "Se debe ingresar la direccion del cliente";
    private static final String SE_DEBE_INGRESAR_EL_CORREO_DE_USUARIO = "Se debe ingresar un correo correcto de la persona";

    private Integer idCliente;
    private String nombre;
    private String apellido;
    private String cedula;
    private String celular;
    private String dirrecion;
    private String correo;


    public Cliente (Integer idCliente, String nombre, String apellido, String cedula, String celular, String direccion, String correo){
        //Validaciones










        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.celular = celular;
        this.dirrecion = direccion;
        this.correo = correo;
    }

    public Cliente (){

    }


    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getDirrecion() {
        return dirrecion;
    }

    public void setDirrecion(String dirrecion) {
        this.dirrecion = dirrecion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
