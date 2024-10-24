package com.example.DailyActivities.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Actividades {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer usuario_fk;
    private String titulo;
    private String descripcion;
    private String estado;
    private String prioridad;
    private Date fechaDeCreacion;
    private Date fechaDeActualizacion;

    public Actividades() {
    }

    public Actividades(Integer usuario_fk, String titulo, String descripcion, String estado, String prioridad, Date fechaDeCreacion, Date fechaDeActualizacion) {
        this.usuario_fk = usuario_fk;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.estado = estado;
        this.prioridad = prioridad;
        this.fechaDeCreacion = fechaDeCreacion;
        this.fechaDeActualizacion = fechaDeActualizacion;
    }

    public Integer getUsuario_fk() {
        return usuario_fk;
    }

    public void setUsuario_fk(Integer usuario_fk) {
        this.usuario_fk = usuario_fk;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Date getFechaDeActualizacion() {
        return fechaDeActualizacion;
    }

    public void setFechaDeActualizacion(Date fechaDeActualizacion) {
        this.fechaDeActualizacion = fechaDeActualizacion;
    }

    // Getters and Setters
}
