package com.ceiba.cinema.infraestructura.convertir.alquiler;

import com.ceiba.cinema.dominio.modelo.Alquiler;
import com.ceiba.cinema.dominio.modelo.dto.AlquilerDTO;
import com.ceiba.cinema.infraestructura.entidades.AlquilerEntidad;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConvertirAlquiler {

    private ModelMapper modelMapper = new ModelMapper();

    public AlquilerEntidad convertirAlquilerDominioAlquilerEntidad(Alquiler alquiler){
        return modelMapper.map(alquiler, AlquilerEntidad.class);
    }

    public List<AlquilerDTO> convertirListaAlquilerEntidadAListaAlquiler(List<AlquilerEntidad> listaAlquilerEntidad, List<AlquilerDTO> listaAlquiler ){
        for(AlquilerEntidad alquilerEntidad: listaAlquilerEntidad){
            AlquilerDTO alquiler = modelMapper.map(alquilerEntidad, AlquilerDTO.class);
            listaAlquiler.add(alquiler);
        }
        return listaAlquiler;
    }




}
