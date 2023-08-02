package com.example.gymApp.services;

import com.example.gymApp.Dtos.WorkoutClassesDto;
import com.example.gymApp.entities.WorkoutClasses;
import com.example.gymApp.repositories.WorkoutClassesRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class WorkoutClassesServiceImpl {
    private WorkoutClassesRepository workoutClassesRepository;

    @Override
    @Transactional
    public Optional<WorkoutClassesDto> getWorkoutClasses(Long classes) {
        Optional<WorkoutClasses> workoutClassesOptional = workoutClassesRepository.findById(classes);
        if (workoutClassesOptional.isPresent()) {
            return Optional.of(new WorkoutClassesDto(workoutClassesOptional.get()));
        }
        return Optional.empty();
    }

    @Override
    @Transactional
    public List<WorkoutClassesDto> getAllWorkoutClasses() {
        List<WorkoutClasses> workoutClassesList = workoutClassesRepository.findAll();
        return workoutClassesList.stream().map(classes -> new WorkoutClassesDto(classes)).collect(Collectors.toList());
    }
}
