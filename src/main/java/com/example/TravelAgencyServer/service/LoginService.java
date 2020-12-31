package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.dao.EmployeeRepository;
import com.example.TravelAgencyServer.dao.UserRepository;
import com.example.TravelAgencyServer.model.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    private final UserRepository userRepository;
    private final EmployeeRepository employeeRepository;

    @Autowired
    public LoginService(UserRepository userRepository, EmployeeRepository employeeRepository) {
        this.userRepository = userRepository;
        this.employeeRepository = employeeRepository;
    }

    public LoginResponse loginUser(String nick, String password) {
        var searchUser = userRepository.findUserByNickAndPassword(nick, password);
        if (searchUser != null) {
            System.out.println("Znaleziono usera!");
            return LoginResponse.USER;
        } else {
            var searchEmployee = employeeRepository.findEmployeeByNickAndPassword(nick, password);
            if (searchEmployee != null) {
                System.out.println("Znaleziono employee!");
                return LoginResponse.EMPLOYEE;
            } else {
                System.out.println("Nie znaleziono zadnego usera!");
                return LoginResponse.WRONG_CREDENTIALS;
            }
        }
    }
}
