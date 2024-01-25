package com.softtek.Gestor.controllers;

import com.softtek.Gestor.models.Evento;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class EventoController {

    List<Evento> eventos = new ArrayList<>();

    @PostMapping("/evento")
    public String crearEvento(@RequestBody Evento nuevoEvento) {
        eventos.add(nuevoEvento);
        return "Evento añadido a la lista: " + nuevoEvento.getTitulo() + " " + nuevoEvento.getDescripcion();
    }

    @GetMapping("/eventos")
    public List<Evento> traerEventos() {
        return eventos;
    }

    @GetMapping("/evento/{id}")
    public Evento traerEventoPorId(@PathVariable Integer id) {
        return eventos.stream()
                .filter(a -> Objects.equals(a.getId(), id))
                .findFirst()
                .orElse(null);
    }
}
