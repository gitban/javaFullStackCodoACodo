package com.consultorio.dramado.usuarios;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table

public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    public String nombre;
    public String apellido;
    public String email;
    public String telefono;
    public String direccion;
    public Integer rol_id;
    public Date created_at;

    public Usuarios() {
    }

    public Usuarios(String nombre, String apellido, String email, String telefono, String direccion, Integer rol_id) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
        this.rol_id = rol_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Integer getRol_id() {
        return rol_id;
    }

    public void setRol_id(Integer rol_id) {
        this.rol_id = rol_id;
    }
}
