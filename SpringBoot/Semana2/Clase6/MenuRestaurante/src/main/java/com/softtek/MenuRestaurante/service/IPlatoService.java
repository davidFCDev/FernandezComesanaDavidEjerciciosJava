package com.softtek.MenuRestaurante.service;

import com.softtek.MenuRestaurante.dto.PlatoDTO;
import com.softtek.MenuRestaurante.model.Plato;

import java.util.List;

public interface IPlatoService {

    List<Plato> traerPlatos();
    PlatoDTO traerPlatoPorNombre(String nombre);
}
