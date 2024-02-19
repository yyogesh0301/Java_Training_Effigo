package com.spring_boot_api.api_crud.service;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.spring_boot_api.api_crud.model.Employee;
import com.spring_boot_api.api_crud.repository.EmployeeRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class EmployeeService {

	private EmployeeRepository employeeRepository;

	// Method to get all employees
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	// Method to find employee by ID
	public Optional<Employee> findById(Long id) {
		return employeeRepository.findById(id);
	}

	// Method to add a new employee
	public Employee addEmployee(@Valid Employee employee) {
		return employeeRepository.save(employee);
	}

	// Method to update an employee
	public Employee updateEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	// Method to delete an employee
	public void deleteEmployee(Long id) {
		employeeRepository.deleteById(id);
	}
}
