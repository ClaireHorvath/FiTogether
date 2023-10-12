package com.example.gymApp.controllers;

import com.example.gymApp.Dtos.BookClassDto;
import com.example.gymApp.services.BookClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/bookclass")
public class BookClassController {
    @Autowired
    public BookClassService bookClassService;

    @GetMapping("/bookedclass/{usersId}")
    public Optional<BookClassDto> getClassBookingByUserId(@PathVariable Long usersId) {
        return bookClassService.getAllAppointmentsByUserId(usersId);
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
