package com.spring_boot_api.api_crud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring_boot_api.api_crud.dto.EmployeeDto;
import com.spring_boot_api.api_crud.model.Employee;
import com.spring_boot_api.api_crud.service.EmployeeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

	private EmployeeService employeeService;

	// Get all employees
	@GetMapping
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}

	// Get employee by ID
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long id) {
		Optional<Employee> optionalEmployee = employeeService.findById(id);
		if (optionalEmployee.isEmpty()) {
			return null;
		}
		Employee employee = optionalEmployee.get();
		return ResponseEntity.ok().body(employee);
	}

	// Create a new employee
	@PostMapping
	public Employee createEmployee(@RequestBody EmployeeDto employeeDto) {

		Employee employee = new Employee();
		employee.setName(employeeDto.getName());
		employee.setEmail(employeeDto.getEmail());
		return employeeService.addEmployee(employee);
	}

	// Update Employee
	@PutMapping("/{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable(value = "id") Long employeeId,
			@RequestBody EmployeeDto employeeDto) {

		// Search for Employee and if not found throw exception
		Optional<Employee> optionalEmployee = employeeService.findById(employeeId);

		if (optionalEmployee.isEmpty()) {
			return null;
		}

		Employee employee = optionalEmployee.get();
		employee.setEmail(employeeDto.getEmail());
		employee.setName(employeeDto.getName());

		// update employee in db
		Employee updatedEmployee = employeeService.updateEmployee(employee);
		return ResponseEntity.ok(updatedEmployee);
	}

	// Delete employee from DB
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
		employeeService.deleteEmployee(id);
		return ResponseEntity.ok("User Deleted");
	}
}
