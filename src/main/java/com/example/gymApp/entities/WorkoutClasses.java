package com.example.gymApp.entities;

import com.example.gymApp.Dtos.WorkoutClassesDto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "WorkoutClasses")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class WorkoutClasses {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long usersId;


        @Column
        public String classes;

        @Column
        public String description;

        @Column
        public double price;


        public WorkoutClasses(WorkoutClassesDto workoutClassesDto) {
            if (workoutClassesDto.getClasses() != null) {
                this.classes = workoutClassesDto.getClasses();
            }
            if (workoutClassesDto.getDescription() != null) {
                this.description = workoutClassesDto.getDescription();
            }

                this.price = workoutClassesDto.getPrice();

            }
    }
