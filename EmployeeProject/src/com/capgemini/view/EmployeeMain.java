package com.capgemini.view;

import com.capgemini.Repo.EmployeeRepoImpl;
import com.capgemini.Service.EmployeeServiceImpl;
import com.capgemini.beans.Address;
import com.capgemini.beans.City;
import com.capgemini.beans.Country;

public class EmployeeMain {

	public static void main(String[] args) {

	  EmployeeRepoImpl empr = new EmployeeRepoImpl();
      EmployeeServiceImpl emps = new EmployeeServiceImpl(empr);
      
      System.out.println(emps.createEmployee("Raj", new Address("Karol Bagh", new Country("India", new City("Delhi")))));
      System.out.println(emps.createEmployee("Shivam", new Address("Talwade", new Country("India", new City("Pune")))));
      System.out.println(emps.createEmployee("Arvind", new Address("Hinjewadi", new Country("India", new City("Pune")))));
      System.out.println(emps.createEmployee("Pushkal", new Address("Devi Indrani", new Country("India", new City("Indore")))));
      System.out.println(emps.createEmployee("Raj", new Address("Shankar Nagar", new Country("India", new City("Bhopal")))));
	  
      System.out.println("\nResult: ");
      System.out.println(emps.searchByName("Raj"));
	}

}
