package com.ceiba.cinema.infraestructura.convertir.pelicula;
import com.ceiba.cinema.dominio.modelo.Pelicula;
import com.ceiba.cinema.infraestructura.entidades.PeliculaEntidad;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConvertirPelicula {

    private ModelMapper modelMapper = new ModelMapper();

    public PeliculaEntidad convertirPeliculaDominioAPeliculaEntidad(Pelicula pelicula){
        return modelMapper.map(pelicula, PeliculaEntidad.class);
    }


    public List<Pelicula> convertirListaPeliculaEntidadAListaPelicula(List<PeliculaEntidad> listaPeliculaEntidad, List<Pelicula> listaPelicula){
        for(PeliculaEntidad peliculaEntidad: listaPeliculaEntidad){
            Pelicula pelicula = modelMapper.map(peliculaEntidad, Pelicula.class);
            listaPelicula.add(pelicula);
        }
        return listaPelicula;
    }


}
