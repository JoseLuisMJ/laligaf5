package dev.joseluis.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.joseluis.laligaf5.models.detailsteams;
import dev.joseluis.laligaf5.models.staff;
// import dev.joseluis.laligaf5.repositories.Staff;
import dev.joseluis.laligaf5.repositories.StaffRepository;

@Service
public interface StaffService {
    @Autowired

     StaffRepository staffRepository;

    public static List<detailsteams> getStaff(){
        return (List<staff>) staffRepository.findAll();
    }
    
    public static staff saveStaff(staff staff){
        return staffRepository.save(staff);
    }

    public static Optional<staff> getById(Long id){
        return staffRepository.findById(id);
    }
   
    // List<StaffService> findAll();
    // Optional<StaffService> findById(Long id);
    // void save(StaffService staffService);
    // void deleteById(Long id);

}
