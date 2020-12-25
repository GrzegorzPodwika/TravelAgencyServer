package com.example.TravelAgencyServer.dao;

import com.example.TravelAgencyServer.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    Optional<User> findUserByNickAndPassword(String nick, String password);

}
