package com.example.gymApp.services;

import com.example.gymApp.Dtos.WorkoutClassesDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface WorkoutClassesService {
    @Transactional
    Optional<WorkoutClassesDto> getWorkoutClasses(Long classes);

    @Transactional
    List<WorkoutClassesDto> getAllWorkoutClasses();
}
