package dev.joseluis.laligaf5.controllers;

// import java.util.ArrayList;
import java.util.List;

// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.joseluis.laligaf5.models.detailsteams;
import dev.joseluis.laligaf5.repositories.DetailsTeamsRepository;
// import dev.joseluis.services.DetailsTeamsService;

@RestController
// @RestController
// @RequestMapping("/teams")
public class detailsteamscontroller {

    DetailsTeamsRepository service;

    public detailsteamscontroller(DetailsTeamsRepository repository) {
        this.service = service;
    }
    // @Autowired
    // private TeamsService teamsService;
    @GetMapping(path = "/detailsteams")
    public List<detailsteams> index() {

        List<detailsteams> detailsteams = service.getAll();
        return detailsteams;
    }

}


// @RequestMapping("/detailsteams")
// public class detailsteamscontroller {
    
//     @Autowired
//     private DetailsTeamsService detailsteamsService;
//     @GetMapping
//     public ArrayList<detailsteams> getDetailsTeams() {
//         return this.detailsteamsService.getDetailsTeams();
//     }
//     @PostMapping
//     public detailsteamscontroller saveDetailsTeam(@RequestBody detailsteamsmodels);
//     return this.saveDetailsTeams(DetailsTeams);
// }
