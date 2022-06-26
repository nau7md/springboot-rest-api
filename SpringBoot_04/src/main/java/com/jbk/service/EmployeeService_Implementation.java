package com.jbk.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.jbk.dao.EmployeeDao_Implementation;
import com.jbk.entity.Country;
import com.jbk.entity.Employee;

@Service
public class EmployeeService_Implementation implements EmployeeService {
	@Autowired
	EmployeeDao_Implementation dao;

	public String addCountry(Country country) {

		String str = dao.addCountry(country);

		return str;

	}

	public List<Country> getAllCountry(Country country) {
		List<Country> list = dao.getAllCountry(country);
		return list;

	}

	public String updateCountry(Country country) {
		String str = dao.updateCountry(country);
		return str;

	}

	public String deleteCountry(String cname) {
		String str = dao.deleteCountry(cname);
		return str;

	}

	public Country getParticularRecord(Integer cid) {
		Country country = dao.getParticularRecord(cid);
		return country;

	}

	public String deleteCountryById(Integer cid) {
		String str = dao.deleteCountryById(cid);
		return str;

	}

	public String addEmployee(Employee employee) {
		String str = dao.addEmployee(employee);
		return str;
	}

	public List<Employee> getAllEmployee() {
		List<Employee> list = dao.getAllEmployee();
		return list;
	}

	public String updateAllEmployee(Employee employee) {
		String str = dao.updateAllEmployee(employee);
		return str;

	}

	public String deleteEmployeeById(Integer id) {
		String str = dao.deleteEmployeeById(id);

		return str;
	}

	public Employee getParticularEmployeeRecord(Integer id) {
		Employee e=dao.getParticularEmployeeRecord(id);
		return e;
	}
	
	public Employee getParticularRecordByStatus(String status) {
		Employee e=dao.getParticularRecordByStatus(status);
		return e;
		
	}

}
