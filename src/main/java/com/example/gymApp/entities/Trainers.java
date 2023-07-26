package com.example.gymApp.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
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
            if (trainerName.getTrainerName() != null) {
                this.trainerName = trainersDto.getTrainerName();
            }
            if (TrainersDto.getClasses() != null) {
                this.classes = trainersDto.getClasses();
            }

            this.price = trainersDto.getPrice();

        }
}
