package com.ceiba.cinema.dominio.excepcion;

public class Excepciones extends RuntimeException {

    private static final long serialVersionUID = 1l;

    public static final String El_CLIENTE_YA_EXISTE = "Cliente ya existe. Verifica las credenciales";
    public static final String LA_PELICULA_YA_EXISTE = "La pelicula ya existe. Verifica nuevamente";

    public Excepciones(String mensaje){
        super(mensaje);
    }
}