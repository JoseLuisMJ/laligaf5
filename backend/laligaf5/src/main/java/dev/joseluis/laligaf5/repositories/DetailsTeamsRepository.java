package dev.joseluis.laligaf5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

// import dev.joseluis.laligaf5.controllers.List;
import dev.joseluis.laligaf5.models.detailsteams;


public interface DetailsTeamsRepository extends JpaRepository<detailsteams, Long>{

    java.util.List<detailsteams> getAll();
    
}
