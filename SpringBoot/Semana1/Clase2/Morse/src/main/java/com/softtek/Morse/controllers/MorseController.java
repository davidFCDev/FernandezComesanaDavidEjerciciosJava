package com.softtek.Morse.controllers;

import com.softtek.Morse.services.MorseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {


    @GetMapping("/morse/{palabra}")
    public String descifrarPalabra(@PathVariable String palabra) {
        return MorseService.convertToMorse(palabra);
    }
}
