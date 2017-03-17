/*package com.trial.services;

import com.trial.model.Employee;
import com.trial.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getAllEmployee(){
        return employeeRepository.findAll();
    }


    public String saveEmployee(Employee employee) {
    employeeRepository.save(employee);
    return "saved";
    }

    public Employee getById(String id) {
        Employee employee=employeeRepository.findById(id);
        return employee;
    }
}
*/