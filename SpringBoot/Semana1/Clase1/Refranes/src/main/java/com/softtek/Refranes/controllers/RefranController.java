package com.softtek.Refranes.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RefranController {

    @GetMapping
    public String getRefran() {
        ArrayList<String> refranes = new ArrayList<String>();
        refranes.add("A caballo regalado no se le mira el diente");
        refranes.add("A Dios rogando y con el mazo dando");
        refranes.add("A falta de pan, tortillas");
        refranes.add("A quien madruga, Dios le ayuda");
        refranes.add("A rey muerto, rey puesto");

        int random = (int) (Math.random() * 5);
        return refranes.get(random);
    }
}
