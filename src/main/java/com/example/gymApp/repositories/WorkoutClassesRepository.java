package com.example.gymApp.repositories;

import com.example.gymApp.entities.WorkoutClasses;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkoutClassesRepository extends JpaRepository<WorkoutClasses, Long> {
        List<WorkoutClasses> findAll();
}
