
package org.example.ejercicio1.logica;

import java.util.List;
import org.example.ejercicio1.persistence.ControladoraPersistencia;


public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void newVote (Vote vote) {
        controlPersis.createVote(vote);
    }
    
    public List<Vote> getVotes () {
        return controlPersis.getAllVotes();
    }
}
