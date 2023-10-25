/**
 * 
 */
package com.boot.learn.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

/**
 * 
 */
@Data
@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	//@GeneratedValue
	@Column(name = "employee_id")
	private Integer employeeId;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String middle;
	
	@Column(name = "last_name")
	private String lastName;

	@Column(name = "age")
	private Integer age;
	
	@Column(name = "mobile")
	private Long mobile;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "department")
	private String department;

	public Integer getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getMiddle() {
		return middle;
	}

	public String getLastName() {
		return lastName;
	}

	public Integer getAge() {
		return age;
	}

	public Long getMobile() {
		return mobile;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartment() {
		return department;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setMiddle(String middle) {
		this.middle = middle;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [employeeId=").append(employeeId).append(", firstName=").append(firstName)
				.append(", middle=").append(middle).append(", lastName=").append(lastName).append(", age=").append(age)
				.append(", mobile=").append(mobile).append(", gender=").append(gender).append(", department=")
				.append(department).append("]");
		return builder.toString();
	}
	

}