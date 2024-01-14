package org.example.integrador.persistencia;

import java.util.List;
import org.example.integrador.logica.Partido;

public class ControladoraPersistenciaPartido {

    PartidoJpaController equipoJPA = new PartidoJpaController();

    public void crearPartido(Partido partido) {
        equipoJPA.create(partido);
    }

    public List<Partido> traerPartidos() {
        return equipoJPA.findPartidoEntities();
    }
}
