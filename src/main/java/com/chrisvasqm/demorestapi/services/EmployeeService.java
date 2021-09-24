package com.chrisvasqm.demorestapi.services;

import com.chrisvasqm.demorestapi.models.Employee;
import com.chrisvasqm.demorestapi.repos.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeesRepository employees;

    public List<Employee> getAll() {
        return employees.findAll();
    }

    public Employee find(Long id) {
        return employees.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("No employee was fond with the id: " + id));
    }
}
