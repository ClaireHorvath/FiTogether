package com.example.gymApp.controllers;

import com.example.gymApp.Dtos.BookClassDto;
import com.example.gymApp.services.BookClassService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Optional;

@RestController
@RequestMapping("/bookclass")
public class BookClassController {
    @Autowired
    public BookClassService bookClassService;

    @GetMapping("/bookedclass/{usersId}")
    public Optional<BookClassDto> getClassBookingByUser(@PathVariable Long usersId) {
        return makeAppointmentService.getAllClassBookingsByUserId(usersId);
    }

    @PutMapping("/{bookedclass}")
    public void updateClassBooking(@RequestBody BookClassDto bookClassDto) {
        bookClassService.updateClassBooking(bookClassDto);
    }

    @PostMapping("/bookedclass/{usersId}")
    public void createClassBooking(@RequestBody BookClassDto bookClassDto, @PathVariable Long usersId) {
        bookClassService.createClassBooking(bookClassDto, usersId);
    }

    @DeleteMapping("/{bookedclass}")
    public void deleteClassBooking(@PathVariable Long bookedClass) {
        bookClassService.deleteClassBooking(bookedClass);
    }
}
