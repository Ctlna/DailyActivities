package com.example.DailyActivities.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
public class Recordatorios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer actividades_fk;
    private Date fechaDeRecordatorio;
    private String mensaje;

    public Recordatorios() {
    }

    public Recordatorios(Integer actividades_fk, Date fechaDeRecordatorio, String mensaje) {
        this.actividades_fk = actividades_fk;
        this.fechaDeRecordatorio = fechaDeRecordatorio;
        this.mensaje = mensaje;
    }

    public Integer getActividades_fk() {
        return actividades_fk;
    }

    public void setActividades_fk(Integer actividades_fk) {
        this.actividades_fk = actividades_fk;
    }

    public Date getFechaDeRecordatorio() {
        return fechaDeRecordatorio;
    }

    public void setFechaDeRecordatorio(Date fechaDeRecordatorio) {
        this.fechaDeRecordatorio = fechaDeRecordatorio;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    // Getters and Setters
}
