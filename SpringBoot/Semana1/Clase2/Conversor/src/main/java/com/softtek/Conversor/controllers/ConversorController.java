package com.softtek.Conversor.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConversorController {

    @GetMapping("/conversor/{cantidad}")
    public String convertirDolares(@PathVariable int cantidad) {
        double cantidadConvertida = (double) cantidad / 100;

        return "La cantidad de " + cantidad + " cm corresponde a " + cantidadConvertida + " metros.";
    }
}
