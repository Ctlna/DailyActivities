package com.example.DailyActivities.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Reportes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer usuario_fk;
    private String tipoReporte;
    private Date fechaInicio;
    private Date fechaFin;
    private Integer actividadesCompletadas;
    private Integer objetivosCompletados;

    public Reportes() {
    }

    public Reportes(Integer usuario_fk, String tipoReporte, Date fechaInicio, Date fechaFin, Integer actividadesCompletadas, Integer objetivosCompletados) {
        this.usuario_fk = usuario_fk;
        this.tipoReporte = tipoReporte;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.actividadesCompletadas = actividadesCompletadas;
        this.objetivosCompletados = objetivosCompletados;
    }

    public Integer getUsuario_fk() {
        return usuario_fk;
    }

    public void setUsuario_fk(Integer usuario_fk) {
        this.usuario_fk = usuario_fk;
    }

    public String getTipoReporte() {
        return tipoReporte;
    }

    public void setTipoReporte(String tipoReporte) {
        this.tipoReporte = tipoReporte;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Integer getActividadesCompletadas() {
        return actividadesCompletadas;
    }

    public void setActividadesCompletadas(Integer actividadesCompletadas) {
        this.actividadesCompletadas = actividadesCompletadas;
    }

    public Integer getObjetivosCompletados() {
        return objetivosCompletados;
    }

    public void setObjetivosCompletados(Integer objetivosCompletados) {
        this.objetivosCompletados = objetivosCompletados;
    }
}