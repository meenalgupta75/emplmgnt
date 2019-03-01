package com.cts.emplmngt.service;

import com.cts.emplmngt.bean.Employee;
import com.cts.emplmngt.dao.EmployeeDAO;
import com.cts.emplmngt.dao.EmployeeDAOImpl;

import antlr.collections.List;

public class EmployeeServiceImpl implements EmployeeService {

	
	private static EmployeeServiceImpl empSeviceImpl;
	private EmployeeDAO e_dao= EmployeeDAOImpl.getInstance();
	public static EmployeeServiceImpl getInstance(){
		if(empSeviceImpl==null){ 
			empSeviceImpl = new EmployeeServiceImpl();
			return empSeviceImpl;
		}
		else{
			return empSeviceImpl;
		}
		
	}
	
	
	public String insertEmployee(Employee employee) {
		System.out.println("Inside service");
		return e_dao.insertEmployee(employee);
	}
	public String deleteEmployee(String id) {
		return null;
	}
	public boolean getEmployee(String id) {
		System.out.println("Inside service");
		
		
	}
	public boolean updateEmployee(String id) {
		return false;
	}
	public List getAllEmployee() {
		return null;
	}
	public List getAllEmployeeByName(String name) {
		return null;
	}
}
