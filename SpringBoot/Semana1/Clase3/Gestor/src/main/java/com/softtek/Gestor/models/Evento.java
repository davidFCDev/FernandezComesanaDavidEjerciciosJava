package com.softtek.Gestor.models;

import java.time.LocalDate;
import java.time.LocalTime;

public class Evento {
    private Integer id;
    private String titulo;
    private String descripcion;
    private LocalDate fecha;
    private LocalTime hora;
    private String lugar;
    private String ponente;

    public Evento() {
    }

    public Evento(Integer id, String titulo, String descripcion, LocalDate fecha, LocalTime hora, String lugar, String ponente) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.ponente = ponente;
    }

    public Integer getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public String getLugar() {
        return lugar;
    }

    public String getPonente() {
        return ponente;
    }
}
