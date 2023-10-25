/**
 * 
 */
package com.boot.learn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.learn.model.Employee;
import com.boot.learn.repository.EmployeeRepository;

/**
 * 
 */

@Service
public class EmployeeService {
	
	@Autowired
	EmployeeRepository empRepository;
	
	public Employee getEmployee(Integer id) {
		return empRepository.findByEmployeeId(id);
	}

	public List<Employee> getEmployee() {
		return empRepository.findAll();
	}

	public Employee saveEmployee(Employee employee) {
		return empRepository.save(employee);
	}

	public void deleteEmployee(Integer id) {
		empRepository.deleteById(id);
	}

}
