package com.example.gymApp.services;

import com.example.gymApp.Dtos.TrainersDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface TrainersService {
    @Transactional
    Optional<TrainersDto> getTrainers(Long trainers);

    @Transactional
    List<TrainersDto> getAllTrainers();
}
