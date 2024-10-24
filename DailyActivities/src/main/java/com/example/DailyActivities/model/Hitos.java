package com.example.DailyActivities.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Hitos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer objetivo_fk;
    private String descripcion;
    private Date fechaDeCreacion;
    private Boolean completado;

    public Hitos() {
    }

    public Hitos(Integer objetivo_fk, String descripcion, Date fechaDeCreacion, Boolean completado) {
        this.objetivo_fk = objetivo_fk;
        this.descripcion = descripcion;
        this.fechaDeCreacion = fechaDeCreacion;
        this.completado = completado;
    }

    public Integer getObjetivo_fk() {
        return objetivo_fk;
    }

    public void setObjetivo_fk(Integer objetivo_fk) {
        this.objetivo_fk = objetivo_fk;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Boolean getCompletado() {
        return completado;
    }

    public void setCompletado(Boolean completado) {
        this.completado = completado;
    }

}
