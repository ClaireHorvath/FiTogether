package com.example.gymApp.entities;

import com.example.gymApp.Dtos.BookClassDto;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "BookClass")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookClass {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        @Column
        public int day;

        @Column
        public double time;

        @Column
        public String classes;

        @Column
        public String trainer;


        @ManyToOne
        @JsonBackReference
        private Users users;

        public BookClass(BookClassDto bookClassDto) {

            this.day = bookClassDto.getDay();

            this.time = bookClassDto.getTime();

            if (bookClassDto.getClasses() != null) {
                this.classes = bookClassDto.getClasses();
            }
            if (bookClassDto.getTrainer() != null) {
                this.trainer = bookClassDto.getTrainer();
            }
        }
}
