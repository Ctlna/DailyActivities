package com.example.DailyActivities.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Colaboraciones {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer actividad_fk;
    private Integer usuario_fk;
    private String rol;

    public Colaboraciones() {
    }

    public Colaboraciones(Integer actividad_fk, Integer usuario_fk, String rol) {
        this.actividad_fk = actividad_fk;
        this.usuario_fk = usuario_fk;
        this.rol = rol;
    }

    public Integer getActividad_fk() {
        return actividad_fk;
    }

    public void setActividad_fk(Integer actividad_fk) {
        this.actividad_fk = actividad_fk;
    }

    public Integer getUsuario_fk() {
        return usuario_fk;
    }

    public void setUsuario_fk(Integer usuario_fk) {
        this.usuario_fk = usuario_fk;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
