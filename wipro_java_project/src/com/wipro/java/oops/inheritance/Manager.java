/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
* Parent class Employee
* Child class is Manager
* extends is a keyword
*/
public class Manager extends Employee {
	
	public Manager() {
		
	}
	/**
	 * @param args
	 */
	public static void main(String a[]) {
		/**
		 * child object is instantiated from child constructor
		 * parent class consumes the prop and behaviors of child class
		 */
		Employee employee= new Manager();
		employee.setId(2);
		employee.setEmailId("test@test.com");
		employee.setName("Somu");
		employee.setSalary(50000);
		System.out.println(employee.getId());
		System.out.println(employee.getEmailId());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
	}
}
