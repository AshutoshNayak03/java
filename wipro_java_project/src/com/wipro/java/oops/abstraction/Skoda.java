/**
 * 
 */
package com.wipro.java.oops.abstraction;

/**
 * 
 */
public class Skoda extends Car {

	@Override
	void color() {
		// TODO Auto-generated method stub
		
		System.out.println("this is color");
		
	}

	@Override
	void model() {
		// TODO Auto-generated method stub
		System.out.println("this is model");
		
	}
	public static void main(String args[]) {
		Skoda skoda= new Skoda();
		skoda.color();
		skoda.model();
	}

}
