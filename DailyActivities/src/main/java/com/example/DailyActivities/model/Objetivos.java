package com.example.DailyActivities.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Objetivos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer usuario_fk;
    private String title;
    private String description;
    private Date fechaDeVencimiento;
    private String estado;
    private Date fechaDeCreacion;

    public Objetivos() {
    }

    public Objetivos(Integer usuario_fk, String title, String description, Date fechaDeVencimiento, String estado, Date fechaDeCreacion) {
        this.usuario_fk = usuario_fk;
        this.title = title;
        this.description = description;
        this.fechaDeVencimiento = fechaDeVencimiento;
        this.estado = estado;
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public Integer getUsuario_fk() {
        return usuario_fk;
    }

    public void setUsuario_fk(Integer usuario_fk) {
        this.usuario_fk = usuario_fk;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getFechaDeVencimiento() {
        return fechaDeVencimiento;
    }

    public void setFechaDeVencimiento(Date fechaDeVencimiento) {
        this.fechaDeVencimiento = fechaDeVencimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(Date fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    // Getters and Setters
}
