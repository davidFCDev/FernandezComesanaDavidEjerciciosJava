
package org.example.ejercicio1.persistence;
import java.util.List;
import org.example.ejercicio1.logica.Vote;

public class ControladoraPersistencia {
    VoteJpaController voteJPA = new VoteJpaController();
    
    public void createVote (Vote vote) {
        voteJPA.create(vote);
    }
    
    public List<Vote> getAllVotes () {
        return voteJPA.findVoteEntities();
    }
}
