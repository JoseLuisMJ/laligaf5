package dev.joseluis.services;

// import java.util.List;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// import dev.joseluis.laligaf5.models.detailsteams;
// import dev.joseluis.laligaf5.models.staff;
// import dev.joseluis.laligaf5.repositories.Staff;
import dev.joseluis.laligaf5.repositories.StaffRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;


@Service
public class StaffService {
private final StaffRepository staffRepository;
    
   @PersistenceContext
   private EntityManager entityManager;
   @Autowired
   public StaffService (StaffRepository staffRepository) {
    this.staffRepository = staffRepository;
   }
public StaffRepository getStaffRepository() {
    return staffRepository;
}
public EntityManager getEntityManager() {
    return entityManager;
}
public void setEntityManager(EntityManager entityManager) {
    this.entityManager = entityManager;
}


    // @Autowired

    //  StaffRepository staffRepository;

    // public static List<staff> getStaff(){
    //     return (List<staff>) staffRepository.findAll();
    // }
    
    // public static staff saveStaff(staff staff){
    //     return staffRepository.save(staff);
    // }

    // public static Optional<staff> getById(Long id){
    //     return staffRepository.findById(id);
    // }
   
    // List<StaffService> findAll();
    // Optional<StaffService> findById(Long id);
    // void save(StaffService staffService);
    // void deleteById(Long id);

}
