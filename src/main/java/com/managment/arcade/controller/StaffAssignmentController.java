package com.managment.arcade.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/staff/assignments")
public class StaffAssignmentController {
    @PostMapping
public String assignStaff() {
    System.out.println("Assigning staff to task/machine...");
    return "Staff assigned.";
}

@GetMapping
public String getAllAssignments() {
    System.out.println("Fetching all staff assignments...");
    return "List of all staff assignments.";
}

@GetMapping("/{id}")
public String getAssignment(@PathVariable String id) {
    System.out.println("Fetching assignment with id: " + id);
    return "Details of assignment " + id;
}

@PutMapping("/{id}")
public String updateAssignment(@PathVariable String id) {
    System.out.println("Updating assignment with id: " + id);
    return "Assignment " + id + " updated.";
}

@DeleteMapping("/{id}")
public String deleteAssignment(@PathVariable String id) {
    System.out.println("Deleting assignment with id: " + id);
    return "Assignment " + id + " deleted.";
}


}