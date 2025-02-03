/**
 * 
 */
package com.wipro.java.oops;

/**
 * Parent class Employee
 * Child class is Developer
 * extends is a keyword
 */
public class Developer extends Employee {
	
	public Developer() {
		
	}

	/**
	 * @param args
	 */
	public static void main(String a[]) {
		/**
		 * child object is instantiated from child constructor
		 * parent class consumes the prop and behaviors of child class
		 */
		Employee employee= new Developer();
		employee.setId(1);
		employee.setEmailId("test@test.com");
		employee.setName("Ashutosh");
		employee.setSalary(20000);
		System.out.println(employee.getId());
		System.out.println(employee.getEmailId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
	}
}
