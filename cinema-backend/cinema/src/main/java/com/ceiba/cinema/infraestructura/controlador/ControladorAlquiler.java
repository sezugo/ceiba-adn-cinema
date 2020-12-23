package com.ceiba.cinema.infraestructura.controlador;

import com.ceiba.cinema.aplicacion.comando.ComandoAlquiler;
import com.ceiba.cinema.aplicacion.comando.manejador.alquiler.ManejadorCrearAlquiler;
import com.ceiba.cinema.aplicacion.comando.manejador.alquiler.ManejadorEliminarAlquiler;
import com.ceiba.cinema.aplicacion.consulta.manejador.alquiler.ManejadorListarAlquiler;
import com.ceiba.cinema.dominio.modelo.dto.AlquilerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/alquiler")
public class ControladorAlquiler {

    private final ManejadorCrearAlquiler manejadorCrearAlquiler;
    private final ManejadorEliminarAlquiler manejadorEliminarAlquiler;
    private final ManejadorListarAlquiler manejadorListarAlquiler;

    public ControladorAlquiler(ManejadorCrearAlquiler manejadorCrearAlquiler, ManejadorEliminarAlquiler manejadorEliminarAlquiler, ManejadorListarAlquiler manejadorListarAlquiler) {
        this.manejadorCrearAlquiler = manejadorCrearAlquiler;
        this.manejadorEliminarAlquiler = manejadorEliminarAlquiler;
        this.manejadorListarAlquiler = manejadorListarAlquiler;
    }

    @PostMapping
    public void crearAlquiler(@RequestBody ComandoAlquiler comandoAlquiler){
        this.manejadorCrearAlquiler.ejecutar(comandoAlquiler);
    }

    @GetMapping
    public List<AlquilerDTO> listarAlquiler(){
        return this.manejadorListarAlquiler.ejecutar();
    }

    @DeleteMapping("/{idAlquiler}")
    public void eliminarAlquiler(@PathVariable Integer idAlquiler){
        this.manejadorEliminarAlquiler.ejecutar(idAlquiler);
    }


}
