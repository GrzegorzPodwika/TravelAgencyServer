package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.dao.UserRepository;
import com.example.TravelAgencyServer.model.User;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public int addUser(User user) {
        userRepository.save(user);
        return 1;
    }

    public User loginUser(String nick, String password) {
        var searchUser = userRepository.findUserByNickAndPassword(nick, password);
        if (searchUser.isPresent()) {
            System.out.println("User has been found" + searchUser.get().getNick());
        } else {
            System.out.println("User == null");
        }
        return searchUser.orElse(null);
    }

    public List<User> findAllUsers() {
        return CollectionUtils.makeList(userRepository.findAll());
    }

    public User updateUser(User userToUpdate) {
        return userRepository.save(userToUpdate);
    }
}
