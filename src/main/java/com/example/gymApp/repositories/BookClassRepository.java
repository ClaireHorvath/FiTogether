package com.example.gymApp.repositories;

import com.example.gymApp.entities.BookClass;
import com.example.gymApp.entities.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookClassRepository extends JpaRepository<BookClass, Long> {
        List<BookClass> findAllByUsersEquals(Users users);
}
