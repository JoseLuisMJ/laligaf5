package dev.joseluis.laligaf5.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import dev.joseluis.laligaf5.models.teams;
import dev.joseluis.services.TeamsService;




@RestController
@RequestMapping("/teams")
public class teamscontroller {
    @Autowired
    private TeamsService teamsService;
    @GetMapping
    public ArrayList<teams> getTeams() {
        return this.teamsService.getTeams();
    }
    @PostMapping
    public teamscontroller saveTeams(@RequestBody teamsmodels);
    return this.saveTeams(Teams);
}
