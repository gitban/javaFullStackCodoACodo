package com.api.vivero.usuarios;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table

public class Usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String apellido;
    @Column(unique=true)
    private Long dni;
    private String telefono;
    private Integer os_id;
    private Integer rol_id;
    private String clave;
    private Date created_at;

    public Usuarios() {
    }
    public Usuarios(Long id, String nombre, String apellido, Long dni, String telefono, Integer os_id, Integer rol_id, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.os_id = os_id;
        this.rol_id = rol_id;
        this.clave = clave;
    }
    public Usuarios(String nombre, String apellido, Long dni, String telefono, Integer os_id, Integer rol_id, String clave) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.telefono = telefono;
        this.os_id = os_id;
        this.rol_id = rol_id;
        this.clave = clave;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Integer getOs_Id() {
        return os_id;
    }

    public void setOs_Id(Integer os_id) {
        this.os_id = os_id;
    }

    public Integer getRol_id() {
        return rol_id;
    }

    public void setRol_id(Integer rol_id) {
        this.rol_id = rol_id;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }
}
