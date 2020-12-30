package com.ceiba.cinema.infraestructura.controlador;

import com.ceiba.cinema.aplicacion.comando.ComandoReserva;
import com.ceiba.cinema.aplicacion.comando.manejador.reserva.ManejadorCrearReserva;
import com.ceiba.cinema.aplicacion.comando.manejador.reserva.ManejadorEliminarReserva;
import com.ceiba.cinema.aplicacion.consulta.manejador.reserva.ManejadorListarReserva;
import com.ceiba.cinema.dominio.modelo.Reserva;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/alquiler")
public class ControladorAlquiler {

    private final ManejadorCrearReserva manejadorCrearReserva;
    private final ManejadorEliminarReserva manejadorEliminarReserva;
    private final ManejadorListarReserva manejadorListarReserva;

    public ControladorAlquiler(ManejadorCrearReserva manejadorCrearReserva, ManejadorEliminarReserva manejadorEliminarReserva, ManejadorListarReserva manejadorListarReserva) {
        this.manejadorCrearReserva = manejadorCrearReserva;
        this.manejadorEliminarReserva = manejadorEliminarReserva;
        this.manejadorListarReserva = manejadorListarReserva;
    }

    @PostMapping
    public void crearAlquiler(@RequestBody ComandoReserva comandoReserva){
        this.manejadorCrearReserva.ejecutar(comandoReserva);
    }

    @GetMapping
    public List<Reserva> listarAlquiler(){
        return this.manejadorListarReserva.ejecutar();
    }

    @DeleteMapping("/{idAlquiler}")
    public void eliminarAlquiler(@PathVariable Integer idAlquiler){
        this.manejadorEliminarReserva.ejecutar(idAlquiler);
    }


}
