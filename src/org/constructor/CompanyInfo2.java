package org.constructor;

public class CompanyInfo2  {
	
	
	public CompanyInfo2(String name) {
		
		this("suhail",95465);
	
		System.out.println("parent Parameterized constructor1:" +name);
		
		
	}
	
	
	public CompanyInfo2(String name, int EmpId) {
		System.out.println("parent parameterized Constructor2: "+name+ "\t" +EmpId);
	}

	
	

	
	
	
	public CompanyInfo2() {
		
	this("suhail");
		
		System.out.println("parent Default constructor");
		
		
		
		
	}
	
	
	



		
		
		
		
		
		
	
	
	
	
	
	
	
	

}
