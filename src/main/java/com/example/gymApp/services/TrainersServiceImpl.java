package com.example.gymApp.services;

import com.example.gymApp.Dtos.TrainersDto;
import com.example.gymApp.entities.Trainers;
import com.example.gymApp.repositories.TrainersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TrainersServiceImpl {
    @Autowired
    private TrainersRepository trainersRepository;

    @Override
    @Transactional
    public Optional<TrainersDto> getTrainers(Long trainers) {
        Optional<Trainers> trainersOptional = trainersRepository.findById(trainers);
        if (trainersOptional.isPresent()) {
            return Optional.of(new TrainersDto(trainersOptional.get()));
        }
        return Optional.empty();
    }

    @Override
    @Transactional
    public List<TrainersDto> getAllTrainers() {
        List<Trainers> trainersList = trainersRepository.findAll();
        return trainersList.stream().map(trainers -> new TrainersDto(trainers)).collect(Collectors.toList());
    }
}
