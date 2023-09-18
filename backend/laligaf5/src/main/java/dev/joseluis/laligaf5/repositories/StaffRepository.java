package dev.joseluis.laligaf5.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dev.joseluis.laligaf5.models.staff;

@Repository
public interface StaffRepository extends JpaRepository<staff, Long>{
    
}
