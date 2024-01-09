package org.example.ejercicio1.logica;

import java.util.ArrayList;
import java.util.List;

public class Directorio {

    private String nombre;
    private List<Directorio> subdirectorios;
    private List<String> archivos;

    public Directorio(String nombre) {
        this.nombre = nombre;
        this.subdirectorios = new ArrayList<>();
        this.archivos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Directorio> getSubdirectorios() {
        return subdirectorios;
    }

    public List<String> getArchivos() {
        return archivos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSubdirectorios(List<Directorio> subdirectorios) {
        this.subdirectorios = subdirectorios;
    }

    public void setArchivos(List<String> archivos) {
        this.archivos = archivos;
    }

    public void agregarArchivo(String archivo) {
        this.archivos.add(archivo);
    }

    public void agregarSubdirectorio(Directorio subdirectorio) {
        this.subdirectorios.add(subdirectorio);
    }
}
