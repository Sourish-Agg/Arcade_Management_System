package com.managment.arcade.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prizes/redemptions")
public class PrizeRedemptionController {
    @PostMapping
public String createPrizeRedemption() {
    System.out.println("Creating new prize redemption...");
    return "Prize redemption created.";
}

@GetMapping
public String getAllPrizeRedemptions() {
    System.out.println("Fetching all prize redemptions...");
    return "List of all prize redemptions.";
}

@GetMapping("/{id}")
public String getPrizeRedemption(@PathVariable String id) {
    System.out.println("Fetching prize redemption with id: " + id);
    return "Details of prize redemption " + id;
}

@PutMapping("/{id}")
public String updatePrizeRedemption(@PathVariable String id) {
    System.out.println("Updating prize redemption with id: " + id);
    return "Prize redemption " + id + " updated.";
}

@DeleteMapping("/{id}")
public String cancelPrizeRedemption(@PathVariable String id) {
    System.out.println("Deleting prize redemption with id: " + id);
    return "Prize redemption " + id + " deleted.";
}

}
