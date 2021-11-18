package com.example.ApiCliente.Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reserva")
public class ReservaModelo {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private String iden;
    private String nombre;
    private boolean transporte;
    private String telefono;
    private int nPersonas;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getIden() {
        return iden;
    }
    public void setIden(String iden) {
        this.iden = iden;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isTransporte() {
        return transporte;
    }
    public void setTransporte(boolean transporte) {
        this.transporte = transporte;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public int getnPersonas() {
        return nPersonas;
    }
    public void setnPersonas(int nPersonas) {
        this.nPersonas = nPersonas;
    }

   
    
}
