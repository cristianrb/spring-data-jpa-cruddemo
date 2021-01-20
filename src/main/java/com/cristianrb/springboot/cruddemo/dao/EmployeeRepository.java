package com.cristianrb.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cristianrb.springboot.cruddemo.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// No need to write any more code. 
	// Methods by default:
	// findAll()
	// findById(...)
	// save(...)
	// deleteById(...)
	
}
