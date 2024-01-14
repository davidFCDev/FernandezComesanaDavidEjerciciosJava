package org.example.integrador.persistencia;

import java.util.List;
import org.example.integrador.logica.Equipo;

public class ControladoraPersistenciaEquipo {

    EquipoJpaController equipoJPA = new EquipoJpaController();

    public void crearEquipo(Equipo equipo) {
        equipoJPA.create(equipo);
    }

    public List<Equipo> traerEquipos() {
        return equipoJPA.findEquipoEntities();
    }

    public Equipo traerEquipoPorId(int id) {
        return equipoJPA.findEquipo(id);
    }
}
