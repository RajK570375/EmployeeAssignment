package com.capgemini.Service;

import java.util.List;

import com.capgemini.beans.Address;
import com.capgemini.beans.Employee;

public interface EmployeeService {

	public Employee createEmployee(String name, Address Add);
	public List<Employee> searchByName(String name);
}
