package com.example.gymApp.entities;

import com.example.gymApp.Dtos.TrainersDto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Trainers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Trainers {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long usersId;


        @Column
        public String trainerName;

        @Column
        public String classes;

        @Column
        public double price;


        public Trainers(TrainersDto trainersDto) {
            if (trainersDto.getTrainerName() != null) {
                this.trainerName = trainersDto.getTrainerName();
            }
            if (trainersDto.getClasses() != null) {
                this.classes = trainersDto.getClasses();
            }

            this.price = trainersDto.getPrice();

        }
}
