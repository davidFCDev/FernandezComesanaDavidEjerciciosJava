package com.softtek.MenuRestaurante.controller;

import com.softtek.MenuRestaurante.dto.PlatoDTO;
import com.softtek.MenuRestaurante.model.Ingrediente;
import com.softtek.MenuRestaurante.model.Plato;
import com.softtek.MenuRestaurante.service.IPlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlatoController {

    @Autowired
    IPlatoService platoService;

    @GetMapping("/platos")
    public List<Plato> traerPlatos() {
        return platoService.traerPlatos();
    }

    @GetMapping("/plato/{nombre}")
    public PlatoDTO traerPlatoPorNombre(@PathVariable String nombre) {
        PlatoDTO platoDTO = platoService.traerPlatoPorNombre(nombre);
        return platoDTO;
    }
}
