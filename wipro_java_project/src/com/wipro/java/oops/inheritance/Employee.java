/**
 * 
 */
package com.wipro.java.oops.inheritance;

/**
 * 
 */
public class Employee {

	/**
	 * 
	 */
	private int employeeId;
	private String employeeName;
	private String emailId;
	private float salary;

	public int getId() {
		return employeeId;
	}

	public void setId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getName() {
		return employeeName;
	}

	public void setName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	/**
	 * @param args
	 */

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", emailId=" + emailId
				+ ", salary=" + salary + "]";
	}

}
