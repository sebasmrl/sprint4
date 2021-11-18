package com.example.ApiCliente.Repositorios;

import java.util.ArrayList;

import com.example.ApiCliente.Modelos.ReservaModelo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepositorio extends CrudRepository<ReservaModelo,Long>{
    ArrayList<ReservaModelo> findByNombre(String nombre);
    
}
