package com.example.gymApp.services;

import com.example.gymApp.Dtos.UsersDto;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UsersService {
    @Transactional
    List<String> addUsers(UsersDto usersDto);

    @Transactional
    List<String> usersLogin(UsersDto usersDto);
}
