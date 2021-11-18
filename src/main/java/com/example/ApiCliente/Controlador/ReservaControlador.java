package com.example.ApiCliente.Controlador;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ApiCliente.Modelos.ReservaModelo;
import com.example.ApiCliente.Servicios.ReservaServicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
//@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/reserva")
public class ReservaControlador {

    @Autowired
    ReservaServicio servicio;

    @PostMapping()
    public ReservaModelo addReserva(@RequestBody ReservaModelo reserva){
        return servicio.addReserva(reserva);        
    }     

    @GetMapping()
    public ArrayList<ReservaModelo> showReservas(){
        return servicio.findReservas();
    }

    @GetMapping(path = "/{id}")
    public Optional<ReservaModelo> consultaReservaPorId(@PathVariable("id") Long id){
        return servicio.findReservaById(id);
    }

    @GetMapping(path = "/buscar")
    public ArrayList<ReservaModelo> buscarReservaPorNombre(String nombre){
        return servicio.findReserveByName(nombre);
    }

    @DeleteMapping(path = "/eliminar/{id}")
    public boolean deleteReserva(@PathVariable("id") Long id){
        return servicio.deleteReserva(id);
    }

    @PutMapping()
    public ReservaModelo updateReserva(@RequestBody ReservaModelo reserva){
        return servicio.updateReserva(reserva);
    }






    
}
