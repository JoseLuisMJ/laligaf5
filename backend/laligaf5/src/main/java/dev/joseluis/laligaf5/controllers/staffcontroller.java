package dev.joseluis.laligaf5.controllers;

// import java.util.ArrayList;
import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.joseluis.laligaf5.models.staff;
import dev.joseluis.laligaf5.repositories.StaffRepository;
// import dev.joseluis.services.StaffService;

@RestController

// @RestController
// @RestController
// @RequestMapping("/teams")
public class staffcontroller {

    StaffRepository service;

    public staffcontroller(StaffRepository repository) {
        this.service = service;
    }
    // @Autowired
    // private TeamsService teamsService;
    @GetMapping(path = "/staff")
    public List<staff> index() {

        List<staff> staff = service.getAll();
        return staff;
    }

}

    // 


// @RequestMapping("/staff")
// public class staffcontroller {
     
//     @Autowired
//     private StaffService staffService;
//     @GetMapping
//     public ArrayList<staff> getStaff() {
//         return this.staffService.getStaff();
//     }
//     @PostMapping
//     public staffcontroller saveStaff(@RequestBody staffmodels);
//     return this.saveStaff(staff);
// }
