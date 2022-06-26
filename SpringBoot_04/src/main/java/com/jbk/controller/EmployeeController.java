package com.jbk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jbk.entity.Country;
import com.jbk.entity.Employee;
import com.jbk.service.EmployeeService_Implementation;

@RestController
@ComponentScan(basePackages = { "com.jbk" })
public class EmployeeController {
	@Autowired
	EmployeeService_Implementation service;

	// 1st API
	@PostMapping("/addcountry")
	public String addCountry(@RequestBody Country country) {
		String str = service.addCountry(country);

		return str;

	}

	// 2nd API
	@GetMapping("/getallcountry")
	public List<Country> getAllCountry(Country country) {
		List<Country> list = service.getAllCountry(country);
		return list;

	}

	// 3rd API
	@PutMapping("/updatecountry")
	public String updateCountry(@RequestBody Country country) {
		String str = service.updateCountry(country);
		return str;

	}

	// API 4
	@DeleteMapping("/deletecountry/{cname}")
	public String deleteCountry(@PathVariable String cname) {

		String str = service.deleteCountry(cname);
		return str;

	}

	// API 5
	@GetMapping("/getparticularrecord/{cid}")

	public Country getParticularRecord(@PathVariable Integer cid) {
		Country country = service.getParticularRecord(cid);
		return country;

	}

	// API 6
	@DeleteMapping("/deletecountrybyid/{cid}")
	public String deleteCountryById(@PathVariable Integer cid) {
		String str = service.deleteCountryById(cid);
		return str;

	}

	// API 7
	@PostMapping("/addemployee")
	public String addEmployee(@RequestBody Employee employee) {
		String str = service.addEmployee(employee);
		return str;

	}

	// API 8
	@GetMapping("/getallemployee")
	public List<Employee> getAllEmployee() {
		List<Employee> list = service.getAllEmployee();

		return list;

	}

	// API 9
	@PutMapping("/updateallemployee")
	public String updateAllEmployee(@RequestBody Employee employee) {
		String str = service.updateAllEmployee(employee);
		return str;

	}

	// API 10
	@DeleteMapping("/deleteemployeebyid/{id}")
	public String deleteEmployeeById(@PathVariable Integer id) {
		String str = service.deleteEmployeeById(id);
		return str;

	}

	// API 11
	@GetMapping("/getparticularemployeerecordbyid/{id}")
	public Employee getParticularEmployeeRecord(@PathVariable Integer id) {
		Employee employee = service.getParticularEmployeeRecord(id);

		return employee;

	}

	// API
	@GetMapping("/getparticularrecordbystatus/{status}")
	public Employee getParticularRecordByStatus(@PathVariable String status) {
		Employee e = service.getParticularRecordByStatus(status);
		return e;

	}

}
