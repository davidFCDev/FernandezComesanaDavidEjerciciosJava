package org.example.ejercicio2;

import org.example.ejercicio2.logica.Tarea;

public class Ejercicio2 {

    public static void main(String[] args) {
        Tarea proyecto = new Tarea("Desarrollo de Software");
        agregarTareas(proyecto, 0);
        proyecto.mostrarTareas(0);
    }

    public static void agregarTareas(Tarea tarea, int nivel) {
        if (nivel > 3) {
            return;
        }
        for (int i = 1; i <= 2; i++) {
            Tarea nuevaTarea = new Tarea("Tarea " + nivel + "." + i);
            tarea.agregarSubtarea(nuevaTarea);
            agregarTareas(nuevaTarea, nivel + 1);
        }

    }
}
