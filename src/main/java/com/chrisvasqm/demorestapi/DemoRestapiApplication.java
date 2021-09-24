package com.chrisvasqm.demorestapi;

import com.chrisvasqm.demorestapi.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRestapiApplication {

	@Autowired
	private EmployeeService service;

	public static void main(String[] args) {
		SpringApplication.run(DemoRestapiApplication.class, args);
	}

}
