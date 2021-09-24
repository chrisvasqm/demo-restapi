package com.chrisvasqm.demorestapi.repos;

import com.chrisvasqm.demorestapi.models.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeesRepository extends CrudRepository<Employee, Long> {

    List<Employee> findAll();

}
