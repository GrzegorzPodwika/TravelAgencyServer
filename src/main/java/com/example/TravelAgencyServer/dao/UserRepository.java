package com.example.TravelAgencyServer.dao;

import com.example.TravelAgencyServer.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    User findUserByNickAndPassword(String nick, String password);
}
