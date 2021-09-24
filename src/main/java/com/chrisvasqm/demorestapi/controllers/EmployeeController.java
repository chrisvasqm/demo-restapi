package com.chrisvasqm.demorestapi.controllers;

import com.chrisvasqm.demorestapi.models.Employee;
import com.chrisvasqm.demorestapi.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping("/employees")
    public List<Employee> getAll() {
        return service.getAll();
    }

    @GetMapping("/employees/{id}")
    public Employee find(@PathVariable Long id) {
        return service.find(id);
    }

}
