package com.softtek.Datos.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class DatosController {

    @GetMapping
    public String getDatos() {
        ArrayList<String> datos = new ArrayList<>();
        datos.add("Los cuervos son capaces de recordar rostros humanos y realizar tareas complejas");
        datos.add("Los gorilas pueden aprender el lenguaje de señas");
        datos.add("Los pulpos tienen tres corazones y su sangre es azul");
        datos.add("Los elefantes pueden sufrir de insomnio");

        int random = (int) (Math.random() * 3);
        return datos.get(random);
    }
}
