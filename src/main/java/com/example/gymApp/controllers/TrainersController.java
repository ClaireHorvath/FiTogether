package com.example.gymApp.controllers;

import com.example.gymApp.Dtos.TrainersDto;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
