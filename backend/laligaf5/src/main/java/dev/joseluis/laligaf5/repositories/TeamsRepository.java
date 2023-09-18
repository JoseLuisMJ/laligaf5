package dev.joseluis.laligaf5.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.joseluis.laligaf5.models.teams;

@Repository
public interface TeamsRepository extends JpaRepository<teams, Long> {

    List<teams> getAll();
    
}
