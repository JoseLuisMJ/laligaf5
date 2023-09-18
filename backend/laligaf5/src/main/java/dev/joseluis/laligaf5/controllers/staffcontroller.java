package dev.joseluis.laligaf5.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.joseluis.laligaf5.models.staff;
import dev.joseluis.services.StaffService;

@RestController
@RequestMapping("/staff")
public class staffcontroller {
     
    @Autowired
    private StaffService staffService;
    @GetMapping
    public ArrayList<staff> getStaff() {
        return this.staffService.getStaff();
    }
    @PostMapping
    public staffcontroller saveStaff(@RequestBody staffmodels);
    return this.saveStaff(staff);
}
