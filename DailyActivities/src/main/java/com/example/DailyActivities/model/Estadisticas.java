package com.example.DailyActivities.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Estadisticas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer usuario_fk;
    private Date fechaDeLaEstadistica;
    private Integer actividadesCompletadas;
    private Integer objetivosCompletados;

    public Estadisticas() {
    }

    public Estadisticas(Integer usuario_fk, Date fechaDeLaEstadistica, Integer actividadesCompletadas, Integer objetivosCompletados) {
        this.usuario_fk = usuario_fk;
        this.fechaDeLaEstadistica = fechaDeLaEstadistica;
        this.actividadesCompletadas = actividadesCompletadas;
        this.objetivosCompletados = objetivosCompletados;
    }

    public Integer getObjetivosCompletados() {
        return objetivosCompletados;
    }

    public void setObjetivosCompletados(Integer objetivosCompletados) {
        this.objetivosCompletados = objetivosCompletados;
    }

    public Integer getActividadesCompletadas() {
        return actividadesCompletadas;
    }

    public void setActividadesCompletadas(Integer actividadesCompletadas) {
        this.actividadesCompletadas = actividadesCompletadas;
    }

    public Date getFechaDeLaEstadistica() {
        return fechaDeLaEstadistica;
    }

    public void setFechaDeLaEstadistica(Date fechaDeLaEstadistica) {
        this.fechaDeLaEstadistica = fechaDeLaEstadistica;
    }

    public Integer getUsuario_fk() {
        return usuario_fk;
    }

    public void setUsuario_fk(Integer usuario_fk) {
        this.usuario_fk = usuario_fk;
    }
}
