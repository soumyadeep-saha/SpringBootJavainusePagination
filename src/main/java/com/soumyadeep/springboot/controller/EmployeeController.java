package com.soumyadeep.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.soumyadeep.springboot.model.Employee;
import com.soumyadeep.springboot.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping(value="/listEmployee", method=RequestMethod.GET)
	Page<Employee> listPagination(Pageable pageable){
		
		return employeeRepository.findAll(pageable);
	}
}
