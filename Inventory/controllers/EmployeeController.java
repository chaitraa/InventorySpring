/*package com.trial.controllers;

import com.trial.model.Employee;
import com.trial.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import javax.validation.Valid;
import java.util.List;
*/
/*

@RestController
@RequestMapping(value = "/")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
@RequestMapping(value = "/employee", method = RequestMethod.GET)
 public List getAllEmployee() {
    return employeeService.getAllEmployee();
}

    @RequestMapping(value = "/saveEmployee", method = RequestMethod.POST,consumes= MediaType.APPLICATION_JSON_VALUE)
    public String saveEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @RequestMapping(value = "/SearchById/{id}", method = RequestMethod.GET)
    public Employee getById(@PathVariable("id")String id)
{
    return employeeService.getById(id);
}
}

*/