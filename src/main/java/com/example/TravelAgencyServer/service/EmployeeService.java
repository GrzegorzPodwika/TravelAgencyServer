package com.example.TravelAgencyServer.service;

import com.example.TravelAgencyServer.api.Dao;
import com.example.TravelAgencyServer.dao.EmployeeRepository;
import com.example.TravelAgencyServer.model.Employee;
import com.example.TravelAgencyServer.utils.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService implements Dao<Employee> {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public Employee findEmployeeByNickAndPassword(String nick, String password) {
        return employeeRepository.findEmployeeByNickAndPassword(nick, password);
    }

    @Override
    public Optional<Employee> get(Integer id) {
        return employeeRepository.findById(id);
    }

    @Override
    public List<Employee> getAll() {
        return CollectionUtils.makeList(employeeRepository.findAll());
    }

    @Override
    public int save(Employee employee) {
        employeeRepository.save(employee);
        return 1;
    }

    @Override
    public Employee update(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public void delete(Employee employee) {
        employeeRepository.delete(employee);
    }
}
