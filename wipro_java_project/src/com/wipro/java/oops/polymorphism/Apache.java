/**
 * 
 */
package com.wipro.java.oops.polymorphism;

/**
 * 
 */
public class Apache extends Vehicle{
	public void display() {
		System.out.println("Vehicle name:"+getName()+" Engine Type:"+getEngine()+" with color:"+getColor());
	}
	public static void main(String[] args) {
		
		Vehicle vehicle= new Apache();
		vehicle.setColor("Red");
		vehicle.setEngine("2 stroke");
		vehicle.setName("Apache RTR 4V");
		vehicle.display();
	}

}
