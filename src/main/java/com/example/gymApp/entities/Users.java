package com.example.gymApp.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;


        @Column(nullable = false, unique = true)
        private String username;

        @Column(unique = true)
        private String password;

        @OneToMany(mappedBy = "users", fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST}, orphanRemoval = true)
        @JsonManagedReference
        private Set<BookClass> bookClassSet = new HashSet<>();



        public Users(UsersDto usersDto){
            if (usersDto.getUsername() != null) {
                this.username = usersDto.getUsername();
            }
            if (usersDto.getPassword() != null) {
                this.password = usersDto.getPassword();
            }
        }
}
