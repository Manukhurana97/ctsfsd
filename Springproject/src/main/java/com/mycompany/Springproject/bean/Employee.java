package com.mycompany.Springproject.bean;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor

public class Employee {
	private int empid;
	private String empname;
	
	
	address add = null;

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname  + ", add=" + add + "]";
	}
	

}
