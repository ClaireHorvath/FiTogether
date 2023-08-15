package com.example.gymApp.controllers;

import com.example.gymApp.Dtos.WorkoutClassesDto;
import com.example.gymApp.services.WorkoutClassesService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
