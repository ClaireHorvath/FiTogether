package com.example.gymApp.Dtos;

import com.example.gymApp.entities.BookClass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookClassDto implements Serializable {

        public int day;
        public double time;
        public String classes;
        public String trainer;

        public BookClassDto(BookClass bookClass) {

            this.day = bookClass.getDay();

            this.time = bookClass.getTime();

            if (bookClass.getClasses() != null) {
                this.classes = bookClass.getClasses();
            }
            if (bookClass.getTrainer() != null) {
                this.trainer = bookClass.getTrainer();
            }
        }
    }
