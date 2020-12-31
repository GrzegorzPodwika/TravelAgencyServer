package com.example.TravelAgencyServer.api;

import com.example.TravelAgencyServer.model.Employee;
import com.example.TravelAgencyServer.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController implements Dao<Employee>{
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/loginEmployee")
    public @ResponseBody
    Employee loginUser(@RequestParam("nick") String nick, @RequestParam("password") String password) {
        return employeeService.findEmployeeByNickAndPassword(nick, password);
    }

    @Override
    @GetMapping("/getEmployee")
    public @ResponseBody
    Optional<Employee> get(@RequestBody Integer id) {
        return employeeService.get(id);
    }

    @Override
    @GetMapping("/getAllEmployees")
    public @ResponseBody
    List<Employee> getAll() {
        return employeeService.getAll();
    }

    @Override
    @PostMapping("/saveEmployee")
    public @ResponseBody
    int save(@RequestBody Employee employee) {
        return employeeService.save(employee);
    }

    @Override
    @PostMapping("/updateEmployee")
    public @ResponseBody
    Employee update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }

    @Override
    @PostMapping("/deleteEmployee")
    public void delete(@RequestBody Employee employee) {
        employeeService.delete(employee);
    }
}
