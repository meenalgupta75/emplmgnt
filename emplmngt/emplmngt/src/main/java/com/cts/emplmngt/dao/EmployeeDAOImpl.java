package com.cts.emplmngt.dao;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import com.cts.emplmngt.bean.Employee;
import com.cts.emplmngt.util.HibernateUtil;



public class EmployeeDAOImpl implements EmployeeDAO {
	
	
	private SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
	
	private static EmployeeDAOImpl empDAOImpl;
	public static EmployeeDAOImpl getInstance(){
		if(empDAOImpl==null){ 
			empDAOImpl = new EmployeeDAOImpl();
			return empDAOImpl;
		}
		else{
			return empDAOImpl;
		}
		
	}
	private EmployeeDAOImpl(){
		
	}
	
	

	public String insertEmployee(Employee employee) {
		Session session=null;
		Transaction transaction=null;
		
		try{
		session= sessionFactory.openSession();
		transaction = session.getTransaction();
		System.out.println("Inside DAO");
		transaction.begin();
		session.save(employee);
		System.out.println("Tuple inserted");
		transaction.commit();
		
		return null;
		}
		
		catch(Exception e){
			
			if(transaction!=null){
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		finally{
			if(session!=null){
				session.close();
			}
		}
		return null;
	}
	public String deleteEmployee(String employee) {
		
		return null;
	}
	public String getEmployee(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean updateEmployee(String id) {
		Session session=null;
		Transaction transaction=null;
		
		try{
		session= sessionFactory.openSession();
		transaction = session.getTransaction();
		System.out.println("Inside DAO - update");
		transaction.begin();
		session.update(id);
		System.out.println("Tuple inserted");
		transaction.commit();
		
		
		}
		
		catch(Exception e){
			
			if(transaction!=null){
				transaction.rollback();
			}
			e.printStackTrace();
		}
		
		finally{
			if(session!=null){
				session.close();
			}
		}
		return true;
		
	}
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Employee> getAllEmployeeByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
