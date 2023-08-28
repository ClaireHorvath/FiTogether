package com.example.gymApp.services;

import com.example.gymApp.Dtos.UsersDto;
import com.example.gymApp.entities.Users;
import com.example.gymApp.repositories.UsersRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public List<String> addUsers(UsersDto usersDto) {
        List<String> response = new ArrayList<>();
        Users users = new Users(new UsersDto());
        usersRepository.saveAndFlush(users);
        response.add("http://localhost:8080/home.html");
        return response;
    }

    @Override
    public List<String> usersLogin(UsersDto usersDto) {

        return null;
    }

    @Transactional
    public List<String> userLogin(UsersDto usersDto) {
        List<String> response = new ArrayList<>();
        Optional<Users> usersOptional = usersRepository.findByUsername(usersDto.getUsername());
        if (usersOptional.isPresent()) {
            if (passwordEncoder.matches(usersDto.getPassword(), usersOptional.get().getPassword())) {
                response.add("User Login was Successful!");
                response.add(String.valueOf(usersOptional.get().getId()));
            } else {
                response.add("Username or Password is incorrect");
            }
        } else {
            response.add("Username or Password is incorrect");
        }
        return response;
    }
}
