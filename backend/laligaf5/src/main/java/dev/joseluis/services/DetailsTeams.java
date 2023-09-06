package dev.joseluis.services;

import org.hibernate.mapping.List;

public interface DetailsTeamsService {

    List<DetailsTeams> findAll();
    Optional<DetailsTeams> findById(Long id);
    void save(DetailsTeams detailsteams);
    void deleteById(Long id);
}
