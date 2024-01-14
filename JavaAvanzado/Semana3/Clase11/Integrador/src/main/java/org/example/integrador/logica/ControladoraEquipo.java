package org.example.integrador.logica;

import java.util.List;
import org.example.integrador.persistencia.ControladoraPersistenciaEquipo;

public class ControladoraEquipo {

    ControladoraPersistenciaEquipo controlPersis = new ControladoraPersistenciaEquipo();

    public void crearEquipo(Equipo equipo) {
        controlPersis.crearEquipo(equipo);
    }

    public List<Equipo> traerEquipos() {
        return controlPersis.traerEquipos();
    }

    public Equipo traerEquipoPorId(int id) {
        return controlPersis.traerEquipoPorId(id);
    }
}
