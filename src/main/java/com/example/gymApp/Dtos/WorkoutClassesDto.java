package com.example.gymApp.Dtos;

import com.example.gymApp.entities.WorkoutClasses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WorkoutClassesDto implements Serializable {

        private Long usersId;
        public String classes;
        public String description;
        public double price;

        public WorkoutClassesDto(WorkoutClasses workoutClasses) {
            if (workoutClasses.getUsersId() != null) {
                this.usersId = workoutClasses.getUsersId();
            }
            if (workoutClasses.getClasses() != null) {
                this.classes = workoutClasses.getClasses();
            }
            if (workoutClasses.getDescription() != null) {
                this.description = workoutClasses.getDescription();
            }

            this.price = workoutClasses.getPrice();

            }
    }
