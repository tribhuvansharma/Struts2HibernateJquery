package com.ebix.autocomplete.employee.dao;

import java.util.List;

import com.ebix.autocomplete.employee.model.Employee;

/**
 * @author Tribhuvan Sharma
 *
 */
public interface EmployeeDao {
	// Employee detail related operations
	
	public List<String> listEmployeessJquery(String name);
	
}
