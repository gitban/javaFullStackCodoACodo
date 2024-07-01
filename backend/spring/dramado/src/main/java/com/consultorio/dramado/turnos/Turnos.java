package com.consultorio.dramado.turnos;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table

public class Turnos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTurno;
    @Column(unique = true)
    private Timestamp turno_fecha;
    private Boolean asignado;
    private Integer usuario_id;

    public Turnos() {
    }

    public Turnos(Integer idTurno, Timestamp turno_fecha, Boolean asignado, Integer usuario_id) {
        this.idTurno = idTurno;
        this.turno_fecha = turno_fecha;
        this.asignado = asignado;
        this.usuario_id = usuario_id;
    }

    public Turnos(Timestamp turno_fecha, Boolean asignado, Integer usuario_id) {
        this.turno_fecha = turno_fecha;
        this.asignado = asignado;
        this.usuario_id = usuario_id;
    }

    public Integer getIdturno() {
        return idTurno;
    }

    public void setIdturno(Integer idTurno) {
        this.idTurno = idTurno;
    }

    public Date getTurno_fecha() {
        return turno_fecha;
    }

    public void setTurno_fecha(Timestamp turno_fecha) {
        this.turno_fecha = turno_fecha;
    }

    public Boolean getAsignado() {
        return asignado;
    }

    public void setAsignado(Boolean asignado) {
        this.asignado = asignado;
    }

    public Integer getUsuario_id() {
        return usuario_id;
    }

    public void setUsuario_id(Integer usuario_id) {
        this.usuario_id = usuario_id;
    }
}
