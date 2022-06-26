package com.jbk.service;

import java.util.List;

import com.jbk.entity.Country;
import com.jbk.entity.Employee;

public interface EmployeeService {
	public String addCountry(Country country) ;
	public List<Country> getAllCountry(Country country);
	public String updateCountry(Country country);
	public String deleteCountry(String cname);
	public Country getParticularRecord(Integer cid);
	public String deleteCountryById(Integer cid);
	
	public String addEmployee(Employee employee) ;
	public List<Employee> getAllEmployee();
	public String updateAllEmployee(Employee employee);
	public String deleteEmployeeById(Integer id);
	public Employee getParticularEmployeeRecord(Integer id) ;
	public Employee getParticularRecordByStatus(String status);

}
