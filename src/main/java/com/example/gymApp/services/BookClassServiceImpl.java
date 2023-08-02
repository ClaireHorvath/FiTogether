package com.example.gymApp.services;

import com.example.gymApp.Dtos.BookClassDto;
import com.example.gymApp.Dtos.WorkoutClassesDto;
import com.example.gymApp.entities.BookClass;
import com.example.gymApp.entities.Users;
import com.example.gymApp.repositories.BookClassRepository;
import com.example.gymApp.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BookClassServiceImpl {
    @Autowired
    public UsersRepository usersRepository;

    @Autowired
    public BookClassRepository bookClassRepository;

    @Override
    @Transactional
    public Optional<BookClassDto> getBookClass(Long booking) {
        Optional<BookClass> bookClassOptional = bookClassRepository.findById(booking);
        if (bookClassOptional.isPresent()) {
            return Optional.of(new BookClassDto(bookClassOptional.get()));
        }
        return Optional.empty();
    }

    @Override
    public List<WorkoutClassesDto> getAllWorkoutClasses() {
        return null;
    }

    @Override
    @Transactional
    public void createClassBooking(BookClassDto bookClassDto, Long usersId) {
        Optional<Users> usersOptional = usersRepository.findById(usersId);
        BookClass bookClass = new BookClass(bookClassDto);
        usersOptional.ifPresent(bookClass::setUsers);
        bookClassRepository.saveAndFlush(bookClass);
    }

    @Override
    @Transactional
    public void deleteClassBooking(Long bookedClass) {
        Optional<BookClass> bookClassOptional = bookClassRepository.findById(bookedClass);
        bookClassOptional.ifPresent(bookClass -> bookClassRepository.delete(bookClass));
    }

    @Override
    @Transactional
    public Optional<BookClassDto> getAllAppointmentsByUserId(Long usersId) {
        Optional<BookClass> bookClassOptional = bookClassRepository.findById(usersId);
        if (bookClassOptional.isPresent()) {
            return Optional.of(new BookClassDto(bookClassOptional.get()));
        }
        return Optional.empty();
    }

    @Override
    @Transactional
    public
}



    @PutMapping("/{bookedclass}")
    public void updateClassBooking(@RequestBody BookClassDto bookClassDto) {
        bookClassService.updateClassBooking(bookClassDto);
    }
