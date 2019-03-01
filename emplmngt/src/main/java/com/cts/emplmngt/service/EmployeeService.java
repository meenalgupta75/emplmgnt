package com.cts.emplmngt.service;

import com.cts.emplmngt.bean.Employee;

import antlr.collections.List;

public interface EmployeeService {

	public String insertEmployee(Employee employee);
	public String deleteEmployee(String id);
	public String getEmployee(String id);
	public boolean updateEmployee(String id);
	public List getAllEmployee();
	public List getAllEmployeeByName(String name);
}
