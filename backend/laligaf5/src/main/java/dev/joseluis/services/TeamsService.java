package dev.joseluis.services;

import java.util.Optional;
import java.util.List;
// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.joseluis.laligaf5.models.teams;
import dev.joseluis.laligaf5.repositories.TeamsRepository;

public interface TeamsService {
    
     @Autowired
    TeamsRepository teamsRepository;

    public static List<teams> getTeams(){
        return (List<teams>) teamsRepository.findAll();
    }
    
    public static teams saveTeams(teams teams){
        return teamsRepository.save(teams);
    }

    public static Optional<teams> getById(Long id){
        return teamsRepository.findById(id);
    }
   
    
    // List<TeamsService> findAll();
    // Optional<TeamsService> findById(Long id);
    // void save(TeamsService teamsService);
    // void deleteById(Long id);
    
}
