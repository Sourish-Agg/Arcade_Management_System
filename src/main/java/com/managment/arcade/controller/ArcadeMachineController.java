package com.managment.arcade.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/arcade-machines")
public class ArcadeMachineController {

    @PostMapping
    public String addArcadeMachine() {
        System.out.println("Adding new arcade machine...");
        return "Arcade machine added.";
    }

@GetMapping
public String getAllArcadeMachines() {
    System.out.println("Fetching all arcade machines...");
    return "List of all arcade machines.";
}

@GetMapping("/{id}")
public String getArcadeMachine(@PathVariable String id) {
    System.out.println("Fetching arcade machine with id: " + id);
    return "Details of arcade machine " + id;
}

@PutMapping("/{id}")
public String updateArcadeMachine(@PathVariable String id) {
    System.out.println("Updating arcade machine with id: " + id);
    return "Arcade machine " + id + " updated.";
}

@DeleteMapping("/{id}")
public String deleteArcadeMachine(@PathVariable String id) {
    System.out.println("Deleting arcade machine with id: " + id);
    return "Arcade machine " + id + " deleted.";
}
}