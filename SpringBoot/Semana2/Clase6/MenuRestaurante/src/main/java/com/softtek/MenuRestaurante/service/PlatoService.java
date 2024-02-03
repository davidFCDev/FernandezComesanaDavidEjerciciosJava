package com.softtek.MenuRestaurante.service;

import com.softtek.MenuRestaurante.dto.PlatoDTO;
import com.softtek.MenuRestaurante.model.Plato;
import com.softtek.MenuRestaurante.repository.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlatoService implements IPlatoService{

    @Autowired
    PlatoRepository platoRepository;

    @Override
    public List<Plato> traerPlatos() {
        return platoRepository.cargarMenu();
    }

    @Override
    public PlatoDTO traerPlatoPorNombre(String nombre) {
        List<Plato> listaPlatos = platoRepository.cargarMenu();
        Plato plato = listaPlatos.stream().filter(p -> p.getNombre().equals(nombre)).findFirst().orElse(null);
        PlatoDTO platoDTO = new PlatoDTO();
        platoDTO.setNombre(plato.getNombre());
        platoDTO.setLista_ingredientes(plato.getLista_ingredientes());
        platoDTO.setCantidad_calorias(plato.getLista_ingredientes().stream().mapToInt(i -> i.getCantidad_calorias()).sum());
        return platoDTO;
    }
}
