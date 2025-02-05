/**
 * 
 */
package com.wipro.java.interfacee;

/**
 * 
 */
public class Cat implements Animal{

	/**
	 * @param args
	 */
	
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("MEOW");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal cat= new Cat();
		cat.makeSound();
		
	}

	

}
