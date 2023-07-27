package com.example.gymApp.repositories;

import com.example.gymApp.entities.Trainers;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrainersRepository extends JpaRepository<Trainers, Long> {
        List<Trainers> findAll();
}
