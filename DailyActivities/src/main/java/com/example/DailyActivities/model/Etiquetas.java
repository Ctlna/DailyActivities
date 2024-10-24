package com.example.DailyActivities.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Etiquetas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer actividades_fk;
    private String nombre;
    private Integer categoria_fk;

    public Etiquetas() {
    }

    public Etiquetas(Integer actividades_fk, String nombre, Integer categoria_fk) {
        this.actividades_fk = actividades_fk;
        this.nombre = nombre;
        this.categoria_fk = categoria_fk;
    }

    public Integer getActividades_fk() {
        return actividades_fk;
    }

    public void setActividades_fk(Integer actividades_fk) {
        this.actividades_fk = actividades_fk;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCategoria_fk() {
        return categoria_fk;
    }

    public void setCategoria_fk(Integer categoria_fk) {
        this.categoria_fk = categoria_fk;
    }
}