package com.example.TravelAgencyServer.dao;

import com.example.TravelAgencyServer.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    Employee findEmployeeByNickAndPassword(String nick, String password);
}
