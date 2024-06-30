package com.consultorio.dramado.obrassociales;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table

public class ObrasSociales {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_os;
    @Column(unique=true)
    private String nombre;
    private String descripcion;
    private String telefono;
    private String direccion;

    public ObrasSociales() {
    }

    public ObrasSociales(Long id_os, String nombre, String descripcion, String telefono, String direccion) {
        this.id_os = id_os;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public ObrasSociales(String nombre, String descripcion, String telefono, String direccion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public Long getId_os() {
        return id_os;
    }

    public void setId_os(Long id_os) {
        this.id_os = id_os;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
