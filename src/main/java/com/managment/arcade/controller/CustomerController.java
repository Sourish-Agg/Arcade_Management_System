package com.managment.arcade.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {
    @PostMapping
public String registerCustomer() {
    System.out.println("Registering new customer...");
    return "Customer registered.";
}

@GetMapping
public String getAllCustomers() {
    System.out.println("Fetching all customers...");
    return "List of all customers.";
}

@GetMapping("/{id}")
public String getCustomer(@PathVariable String id) {
    System.out.println("Fetching customer with id: " + id);
    return "Details of customer " + id;
}

@PutMapping("/{id}")
public String updateCustomer(@PathVariable String id) {
    System.out.println("Updating customer info for id: " + id);
    return "Customer " + id + " updated.";
}

@DeleteMapping("/{id}")
public String deleteCustomer(@PathVariable String id) {
    System.out.println("Deleting customer with id: " + id);
    return "Customer " + id + " deleted.";
}

}