package com.example.gymApp.services;

import com.example.gymApp.Dtos.BookClassDto;
import com.example.gymApp.Dtos.WorkoutClassesDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface BookClassService {
    @Transactional
    Optional<BookClassDto> getBookClass(Long booking);

    List<WorkoutClassesDto> getAllWorkoutClasses();

    @Transactional
    void createClassBooking(BookClassDto bookClassDto, Long usersId);

    @Transactional
    void deleteClassBooking(Long bookedClass);

    @Transactional
    Optional<BookClassDto> getAllAppointmentsByUserId(Long usersId);

    void createClassBooking(BookClassDto bookClassDto);
}
