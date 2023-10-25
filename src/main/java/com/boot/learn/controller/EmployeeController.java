package com.boot.learn.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.http.
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.boot.learn.model.Employee;
import com.boot.learn.service.EmployeeService;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping("/employee")
public class EmployeeController {

	@Autowired
	EmployeeService empService;
	
	@GetMapping("/get")
	public ResponseEntity<Employee> getEmployee(
			@RequestParam("employeeId") Integer employeeId) {
		System.out.println("employeeId: "+employeeId);
		return empService.getEmployee(employeeId);
		
	}

	@GetMapping("/getAll")
	public List<Employee> getEmployee() {
		return empService.getEmployee();
		
	}

	@PostMapping("/add")
	public Employee addEmployee(
			@RequestBody Employee employee) {
		return empService.saveEmployee(employee);
		
	}
	
	@PutMapping("/update")
	public Employee updateEmployee(
			@RequestBody Employee employee) {
		return empService.saveEmployee(employee);
		
	}
	

	@DeleteMapping("/remove")
	public String removeEmployee(
			@RequestParam(name = "employeeId") Integer id) {
		try {
			empService.deleteEmployee(id);
		}catch(Exception e) {
			return "Not deleted "+id;
		}
		return "Removed "+id+" Successfully";
	}
	
}

