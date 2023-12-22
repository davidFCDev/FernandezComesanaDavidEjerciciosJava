package org.example.ejercicio2.persistence;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.example.ejercicio2.models.Platillo;
import org.example.ejercicio2.persistence.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {

    // CRUD
    PlatilloJpaController platoJPA = new PlatilloJpaController();

    public void añadirPlatillo(Platillo plato) {
        platoJPA.create(plato);
    }

    public void borrarPlatillo(int id) {
        try {
            platoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Platillo> traerPlatillos() {
        return platoJPA.findPlatilloEntities();
    }

    public void modificarPlatillo(Platillo plato) {
        try {
            platoJPA.edit(plato);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
