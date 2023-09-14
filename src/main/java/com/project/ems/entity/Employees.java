package com.project.ems.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employees")
public class Employees {
	
	@Id
	@Column(name = "emp_id", length = 50)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long empID;
	
	@Column(name = "emp_name", length = 60)
	private String empName;
	
	@Column(name = "mob_no", length = 15)
	private long mobileNo;
	
	@Column(name = "address", length = 500)
	private String address;

	public long getEmpID() {
		return empID;
	}

	public void setEmpID(long empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
