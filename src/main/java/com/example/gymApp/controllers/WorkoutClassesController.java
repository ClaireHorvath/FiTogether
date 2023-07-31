package com.example.gymApp.controllers;

import com.example.gymApp.Dtos.WorkoutClassesDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workoutclasses")
public class WorkoutClassesController {
    @Autowired
    public WorkoutClassesService workoutClassesService;

    @GetMapping("/")
    public List<WorkoutClassesDto> getAllWorkoutClasses() {

        return workoutClassesService.getAllWorkoutClasses();
    }
}
