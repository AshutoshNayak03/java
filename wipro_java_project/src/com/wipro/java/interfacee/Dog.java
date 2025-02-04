/**
 * 
 */
package com.wipro.java.interfacee;

/**
 * 
 */
public class Dog implements Animal{

	/**
	 * @param args
	 */
	
	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println("bark");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal dog= new Dog();
		dog.makeSound();
		
	}

	

}
