package org.constructor;

public class EmployeeInfo extends CompanyInfo2 {
	
	
	public EmployeeInfo(String name) {
		
		this("Prakash",459845);
		
		System.out.println("Child Parameterized constructor1:" +name);
		
		
	}
	
	
	public EmployeeInfo(String name, int EmpId) {
		
		super();
		System.out.println("Child parameterized Constructor2: "+name+ "\t" +EmpId);
	}

	
	

	
	
	
	public EmployeeInfo() {
		
		this("Madan");
		
		System.out.println("Child Default constructor");
		
		
		
		
	}
	
	
	



	public static void main(String[] args) {
		
		
		EmployeeInfo emp = new EmployeeInfo();
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
