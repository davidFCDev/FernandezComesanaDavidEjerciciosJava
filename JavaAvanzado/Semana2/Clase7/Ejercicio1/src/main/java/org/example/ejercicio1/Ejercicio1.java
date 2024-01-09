package org.example.ejercicio1;

import org.example.ejercicio1.logica.Directorio;
import org.example.ejercicio1.logica.ExploradorDirectorios;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Directorio root = new Directorio("Root");
        Directorio estilos = new Directorio("styles");
        Directorio javascript = new Directorio("javascript");
        Directorio main = new Directorio("main");
        Directorio services = new Directorio("services");
        
        root.agregarSubdirectorio(estilos);
        root.agregarSubdirectorio(javascript);
        javascript.agregarSubdirectorio(main);
        javascript.agregarSubdirectorio(services);
        
        root.agregarArchivo("Readme.md");
        root.agregarArchivo("index.html");
        estilos.agregarArchivo("styles.css");
        main.agregarArchivo("index.js");
        services.agregarArchivo("index.js");
        
        ExploradorDirectorios explorador = new ExploradorDirectorios();
        explorador.explorarDirectorio(root, 0);
    }
}
