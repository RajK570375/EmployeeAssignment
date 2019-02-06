package com.capgemini.Service;

import java.util.List;

import com.capgemini.Repo.EmployeeRepo;
import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeRepo empr;
	
	public EmployeeServiceImpl(EmployeeRepo empr) {
		super();
		this.empr = empr;
	}

	@Override
	public Employee createEmployee(String name, Address add) {
		
		Employee employee = new Employee(name, add);
		
		return empr.save(employee);
	
	}

	@Override
	public List<Employee> searchByName(String name) {
		
		return empr.findByName(name);
		
	}

}
