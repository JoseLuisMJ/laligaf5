package dev.joseluis.services;

// import java.util.ArrayList;
// import java.util.Optional;

// import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import dev.joseluis.laligaf5.models.detailsteams;
import dev.joseluis.laligaf5.repositories.DetailsTeamsRepository;
// import dev.joseluis.laligaf5.repositories.TeamsRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;




@Service
public class DetailsTeamsService {
private final DetailsTeamsRepository detailsteamsRepository;
    
   @PersistenceContext
   private EntityManager entityManager;
   @Autowired
   public DetailsTeamsService (DetailsTeamsRepository detailsteamsRepository) {
    this.detailsteamsRepository = detailsteamsRepository;
   }
public DetailsTeamsRepository getDetailsteamsRepository() {
    return detailsteamsRepository;
}
public EntityManager getEntityManager() {
    return entityManager;
}
public void setEntityManager(EntityManager entityManager) {
    this.entityManager = entityManager;
}

   
}
    // @Autowired
    // DetailsTeamsRepository detailsTeamsRepository;

    // public static List<detailsteams> getDetailsTeams(){
    //     return (List<detailsteams>) detailsTeamsRepository.findAll();
    // }
    
    // public static detailsteams saveDetailsTeams(detailsteams detailsteams){
    //     return detailsTeamsRepository.save(detailsteams);
    // }

    // public static Optional<detailsteams> getById(Long id){
    //     return detailsTeamsRepository.findById(id);
    // }
   

