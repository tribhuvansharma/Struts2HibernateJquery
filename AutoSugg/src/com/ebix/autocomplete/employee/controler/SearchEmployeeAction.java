package com.ebix.autocomplete.employee.controler;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.interceptor.ServletRequestAware;

import com.ebix.autocomplete.employee.dao.EmployeeDao;
import com.ebix.autocomplete.employee.dao.EmployeeDaoImpl;
import com.ebix.autocomplete.employee.model.Employee;
import com.opensymphony.xwork2.ActionSupport;

public class SearchEmployeeAction extends ActionSupport{	
	private static final long serialVersionUID = 1L;

	private String q;
	List<String> employeeList;
	private String name;
	private EmployeeDao empDao = new EmployeeDaoImpl();

	public String getQ() {
		return q;
	}


	public void setQ(String q) {
		this.q = q;
	}


	public List<String> getEmployeeList() {
		return employeeList;
	}


	public void setEmployeeList(List<String> employeeList) {
		this.employeeList = employeeList;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String execute()
	{		
		try
		{
		System.out.println("Autocomplete action");
        employeeList = empDao.listEmployeessJquery(q);
		
		}catch(Exception e)
		{
			e.printStackTrace();
            addActionError(e.getMessage());
            return INPUT;
       
		}
		return SUCCESS;
	}
	
}


