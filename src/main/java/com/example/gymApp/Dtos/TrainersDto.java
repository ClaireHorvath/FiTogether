package com.example.gymApp.Dtos;

import com.example.gymApp.entities.Trainers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TrainersDto implements Serializable {

        public String trainerName;
        public String classes;
        public double price;

        public TrainersDto(Trainers trainers) {
            if (trainers.getTrainerName() != null) {
                this.trainerName = trainers.getTrainerName();
            }
            if (trainers.getClasses() != null) {
                this.classes = trainers.getClasses();
            }

            this.price = trainers.getPrice();

        }
}
