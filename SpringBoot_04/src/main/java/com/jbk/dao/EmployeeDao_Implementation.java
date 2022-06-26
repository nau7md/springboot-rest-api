package com.jbk.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.jbk.entity.Country;
import com.jbk.entity.Employee;

@Repository
public class EmployeeDao_Implementation implements EmployeeDao {
	@Autowired
	SessionFactory sessionFactory;

	public String addCountry(Country country) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();

		int i = (int) session.save(country);
		transaction.commit();
		if (i > 0) {
			return "Country " + country.getCid() + " Added Successfully";
		} else
			return "Something Wrong!";

	}

	public List<Country> getAllCountry(Country country) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Country.class);
		List<Country> list = criteria.list();

		// List<Country> list=session.createCriteria(Country.class).list();

		return list;

	}

	public String updateCountry(Country country) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(country);
		transaction.commit();
		return "Country " + country.getCid() + " Updated Successfully...";

	}

	public String deleteCountry(String cname) {
		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		Criteria criteria = session.createCriteria(Country.class);

		criteria.add(Restrictions.eq("cname", cname));

		Country country = (Country) criteria.uniqueResult();

		session.delete(country);
		transaction.commit();
		return "Country " + cname + " deleted Successfully";

	}

	public Country getParticularRecord(Integer cid) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Country.class);
		criteria.add(Restrictions.eq("cid", cid));
		Country country = (Country) criteria.uniqueResult();

		return country;

	}

	public String deleteCountryById(Integer cid) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(Country.class);
		criteria.add(Restrictions.eq("cid", cid));
		Country country = (Country) criteria.uniqueResult();
		session.delete(country);
		transaction.commit();
		return "Country " + country.getCname() + " is deleted successfully";
	}

	public String addEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(employee);
		transaction.commit();
		return "Employee Added " + employee.getId() + " Successfully";
	}

	public List<Employee> getAllEmployee() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		List<Employee> list = criteria.list();

		return list;
	}

	public String updateAllEmployee(Employee employee) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		session.saveOrUpdate(employee);
		transaction.commit();
		return "Employee " + employee.getId() + " is updated successfully";

	}

	public String deleteEmployeeById(Integer id) {
		Session session = sessionFactory.openSession();
		Transaction transaction = session.beginTransaction();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("id", id));
		Employee e = (Employee) criteria.uniqueResult();
		session.delete(e);
		transaction.commit();

		return "Employee " + e.getName() + " is deleted successfully";
	}

	public Employee getParticularEmployeeRecord(Integer id) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class);
		criteria.add(Restrictions.eq("id", id));
		Employee e = (Employee) criteria.uniqueResult();
		return e;

	}

	public Employee getParticularRecordByStatus(String status) {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Employee.class).add(Restrictions.eq("status", status));
		Employee e = (Employee) criteria.uniqueResult();
		return e;
	}

	@Override
	public List<Employee> getAllEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
}
