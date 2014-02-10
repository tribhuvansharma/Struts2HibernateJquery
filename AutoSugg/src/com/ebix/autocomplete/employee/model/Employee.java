package com.ebix.autocomplete.employee.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Tribhuvan Sharma
 *
 */
@Entity
@Table(name="Employee")
public class Employee implements Serializable{

	private static final long serialVersionUID = -723583058586873479L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name="empId")
	private String empId;
	
	@Column(name="empName")
	private String empName;
	
	@Column(name="empSalaryIncrement")
	private Long empSalaryIncrement;
	
	@Column(name="empDesignation")
	private String empDesignation;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Long getEmpSalaryIncrement() {
		return empSalaryIncrement;
	}

	public void setEmpSalaryIncrement(Long empSalaryIncrement) {
		this.empSalaryIncrement = empSalaryIncrement;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	
}
