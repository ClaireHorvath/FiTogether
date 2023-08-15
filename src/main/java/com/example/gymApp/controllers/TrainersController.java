package com.example.gymApp.controllers;

import com.example.gymApp.Dtos.TrainersDto;
import com.example.gymApp.services.TrainersService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/trainers")
public class TrainersController {
    @Autowired
    public TrainersService trainersService;

    @GetMapping("/")
    public List<TrainersDto> getAllTrainers() {

        return trainersService.getAllTrainers();
    }
}
