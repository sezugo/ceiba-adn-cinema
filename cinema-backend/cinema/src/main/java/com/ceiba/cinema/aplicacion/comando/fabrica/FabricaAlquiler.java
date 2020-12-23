package com.ceiba.cinema.aplicacion.comando.fabrica;

import com.ceiba.cinema.aplicacion.comando.ComandoAlquiler;
import com.ceiba.cinema.dominio.modelo.Alquiler;
import org.springframework.stereotype.Component;

@Component
public class FabricaAlquiler {

    public Alquiler crear(ComandoAlquiler comandoAlquiler){
        return new Alquiler(comandoAlquiler.getIdAlquiler(), comandoAlquiler.getCliente(), comandoAlquiler.getPelicula(),
                comandoAlquiler.getFecha(), comandoAlquiler.getValorTotal());
    }

}
