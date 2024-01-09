package org.example.ejercicio2.logica;

import java.util.ArrayList;
import java.util.List;

public class Tarea {

    private String nombre;
    private List<Tarea> subtareas;

    public Tarea(String nombre) {
        this.nombre = nombre;
        this.subtareas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Tarea> getSubtareas() {
        return subtareas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSubtareas(List<Tarea> subtareas) {
        this.subtareas = subtareas;
    }

    public void agregarSubtarea(Tarea subtarea) {
        this.subtareas.add(subtarea);
    }

    public void mostrarTareas(int nivel) {
        StringBuilder espacio = new StringBuilder();
        for (int i = 0; i < nivel; i++) {
            espacio.append("|--"); 
        }
        System.out.println(espacio + " " + this.nombre);

        for (Tarea subtarea : subtareas) {
            subtarea.mostrarTareas(nivel + 1);
        }

    }
}
