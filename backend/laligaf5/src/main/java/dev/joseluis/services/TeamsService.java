package dev.joseluis.services;

// import java.util.Optional;
// import java.util.List;
// import org.hibernate.mapping.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
// import dev.joseluis.laligaf5.models.teams;
import dev.joseluis.laligaf5.repositories.TeamsRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
// import jakarta.transaction.Transactional;

@Service
public class TeamsService {
private final TeamsRepository teamsRepository;
    
   @PersistenceContext
   private EntityManager entityManager;
   @Autowired
   public TeamsService (TeamsRepository teamsRepository) {
    this.teamsRepository = teamsRepository;
   }
   
public TeamsRepository getTeamsRepository() {
    return teamsRepository;
}
public EntityManager getEntityManager() {
    return entityManager;
}
public void setEntityManager(EntityManager entityManager) {
    this.entityManager = entityManager;
}
   
  
    // List<TeamsService> findAll();
    // Optional<TeamsService> findById(Long id);
    // void save(TeamsService teamsService);
    // void deleteById(Long id);
    
}
