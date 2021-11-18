package com.example.ApiCliente.Servicios;

import java.util.ArrayList;
import java.util.Optional;

import com.example.ApiCliente.Modelos.ReservaModelo;
import com.example.ApiCliente.Repositorios.ReservaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class ReservaServicio {
    
    @Autowired
    ReservaRepositorio repo;

    public ReservaModelo addReserva(ReservaModelo reserva){
        return repo.save(reserva);
    }

    public ArrayList<ReservaModelo> findReservas(){
        return (ArrayList<ReservaModelo>) repo.findAll();        
    }

    public Optional<ReservaModelo> findReservaById(Long id){
        return repo.findById(id);     
     
    }    

    public ArrayList<ReservaModelo> findReserveByName(String nombre){
        return repo.findByNombre(nombre);
    }

    public boolean deleteReserva(Long id){
        if(repo.existsById(id)){
            repo.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }

    public ReservaModelo updateReserva(ReservaModelo reserva){
        return repo.save(reserva);
    }
    
}
