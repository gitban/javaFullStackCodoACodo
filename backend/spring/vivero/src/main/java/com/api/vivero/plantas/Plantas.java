package com.api.vivero.plantas;

import jakarta.persistence.*;

import java.sql.Timestamp;
@Entity
@Table
public class Plantas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true)
    private String nombre;
    private String especie;
    private String descripcion;
    private Double precio;

    public Plantas() {
    }

    public Plantas(Integer id, String nombre, String especie, String descripcion, Double precio) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Plantas(String nombre, String especie, String descripcion, Double precio) {
        this.nombre = nombre;
        this.especie = especie;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
