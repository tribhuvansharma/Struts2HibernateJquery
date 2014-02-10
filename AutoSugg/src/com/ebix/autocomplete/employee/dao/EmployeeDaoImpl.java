package com.ebix.autocomplete.employee.dao;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ebix.autocomplete.employee.model.Employee;
import com.ebix.autocomplete.employee.util.HibernateUtil;

/**
 * @author Tribhuvan Sharma
 *
 */

public class EmployeeDaoImpl implements EmployeeDao {

    /**
     * The below methods will be used for handling the Employee Detail related
	 * operations
	 */
	 
	    /**
	     * This function retrieves Employee detail from the database
	     */
	
	@SuppressWarnings("unchecked")
	public List<String> listEmployeessJquery(String name) {
		SessionFactory sessionFactory;
		List<Employee> userList= null;
		List<String> employeeList=null;
		//Employee employee = new Employee();
		try
		{
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		List<Object[]> empObject = session.createSQLQuery("select * FROM Employee WHERE empname like '"+name+"%'").list();
		if(empObject.size()!=0)
		{
			employeeList= new ArrayList<String>();
			for (Object[] employee : empObject) {
				System.out.println(employee[2].toString());
				employeeList.add(employee[2].toString());
		    }
        return employeeList;
		}
	    }
	catch(Exception e)
	{
	  e.printStackTrace();	
	}
		return employeeList;
	}
	
}
