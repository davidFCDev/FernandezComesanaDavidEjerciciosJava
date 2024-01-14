package org.example.integrador.logica;

import java.util.List;
import org.example.integrador.persistencia.ControladoraPersistenciaPartido;

public class ControladoraPartido {

    ControladoraPersistenciaPartido controlPersis = new ControladoraPersistenciaPartido();

    public void crearPartido(Partido partido) {
        controlPersis.crearPartido(partido);
    }

    public List<Partido> traerPartidos() {
        return controlPersis.traerPartidos();
    }
}
