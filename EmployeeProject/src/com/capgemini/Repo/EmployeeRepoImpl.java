package com.capgemini.Repo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

import com.capgemini.beans.Employee;

public class EmployeeRepoImpl implements EmployeeRepo {
	
	private HashMap<Integer, Employee> hm = new HashMap<>();
	private int id=100;
	
	
	@Override
	public Employee save(Employee e)
	{
		e.setEmpId(id);
		hm.put(id, e);
		id++;
		return e;
	}
	
	
	@Override
	public List<Employee> findByName(String name)
	{
		ArrayList<Employee> al = new ArrayList<>();
		
		for(Entry<Integer, Employee> e: hm.entrySet())
		{
			if(e.getValue().getName().equals(name))
			{
				al.add(e.getValue());
			}
		}
		
		return al;
		
	}

}
