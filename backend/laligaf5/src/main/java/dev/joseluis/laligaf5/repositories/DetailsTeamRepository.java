package dev.joseluis.laligaf5.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailsTeamRepository extends CrudRepository<DetailsTeam, Long>{
    
}
