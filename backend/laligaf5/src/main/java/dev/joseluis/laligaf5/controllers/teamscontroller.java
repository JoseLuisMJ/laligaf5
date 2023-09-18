package dev.joseluis.laligaf5.controllers;

// import java.util.ArrayList;
import java.util.List;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.joseluis.laligaf5.models.teams;
import dev.joseluis.laligaf5.repositories.TeamsRepository;
// import dev.joseluis.services.TeamsService;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;






@RestController
// @RequestMapping("/teams")
public class teamscontroller {

    TeamsRepository service;

    public teamscontroller(TeamsRepository repository) {
        this.service = service;
    }
    // @Autowired
    // private TeamsService teamsService;
    @GetMapping(path = "/teams")
    public List<teams> index() {

        List<teams> teams = service.getAll();
        return teams;
    }
    //     return service.getAllTeams();
    // // public ArrayList<teams> getTeams() {
    // //     return this.teamsService.getTeams();
    // }
    // @PostMapping
    // public teamsController saveTeams(@RequestBody teamsmodels);
    // return this.saveTeams(Teams);
    // @GetMapping("/{id}")
    // public UserTeams getTeamsById(@PathVariable Long id){
    //     return service.getTeamsById(id);
}
