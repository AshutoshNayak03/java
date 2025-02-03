/**
 * 
 */
package com.wipro.java;

/**
 * 
 */
public class Vehicle {
	
	public void engine() {
		System.out.println("Vehicle has a Engine ");
	}

}
class Bike extends Vehicle{
	public void engine() {
		System.out.println("Bike is 2 stroked engine");
	}
}

class Car extends Vehicle{
	public void engine() {
		System.out.println("Car is a 4 stroked engine");
	}
}
