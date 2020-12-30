package com.ceiba.cinema.infraestructura.convertir.alquiler;

import com.ceiba.cinema.dominio.modelo.Reserva;
import com.ceiba.cinema.dominio.modelo.dto.AlquilerDTO;
import com.ceiba.cinema.infraestructura.entidades.ReservaEntidad;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConvertirAlquiler {

    private ModelMapper modelMapper = new ModelMapper();

    public ReservaEntidad convertirAlquilerDominioAlquilerEntidad(Reserva reserva){
        return modelMapper.map(reserva, ReservaEntidad.class);
    }

    public List<AlquilerDTO> convertirListaAlquilerEntidadAListaAlquiler(List<ReservaEntidad> listaAlquilerEntidad, List<AlquilerDTO> listaAlquiler ){
        for(ReservaEntidad alquilerEntidad: listaAlquilerEntidad){
            AlquilerDTO alquiler = modelMapper.map(alquilerEntidad, AlquilerDTO.class);
            listaAlquiler.add(alquiler);
        }
        return listaAlquiler;
    }




}
