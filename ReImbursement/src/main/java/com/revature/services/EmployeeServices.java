package com.revature.services;

import java.util.List;

import com.revature.daos.EmployeeDao;
import com.revature.daos.EmployeeDaoImpl;
import com.revature.models.Employee;


public class EmployeeServices {
	
	private EmployeeDao ed = new EmployeeDaoImpl();
	
	
	public List<Employee> getAllEmployees(){
		return ed.getEmployees();
	}
	
	public Employee getEmployeeById(int id) {
		return ed.getEmployeeById(id);
	}
	
	public List<String> getUsernames(){
		return ed.getUsernames();
	}
	
	
}
