package com.managment.arcade.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events/bookings")
public class EventBookingController {
    @PostMapping
public String createBooking() {
    System.out.println("Creating new event booking...");
    return "Event booking created.";
}

@GetMapping
public String getAllBookings() {
    System.out.println("Fetching all event bookings...");
    return "List of all event bookings.";
}

@GetMapping("/{id}")
public String getBooking(@PathVariable String id) {
    System.out.println("Fetching booking with id: " + id);
    return "Details of booking " + id;
}

@PutMapping("/{id}")
public String updateBooking(@PathVariable String id) {
    System.out.println("Updating booking with id: " + id);
    return "Booking " + id + " updated.";
}

@DeleteMapping("/{id}")
public String cancelBooking(@PathVariable String id) {
    System.out.println("Deleting booking with id: " + id);
    return "Booking " + id + " deleted.";
}

}