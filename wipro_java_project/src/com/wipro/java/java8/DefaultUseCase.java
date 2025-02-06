/**
 * 
 */
package com.wipro.java.java8;

/**
 * 
 */
interface TestInterface1{
	default void show() {
	System.out.println("default interface 1");
}
	}
interface TestInterface2{
	default void show() {
	System.out.println("default interface 2");
}
	}
public class DefaultUseCase implements TestInterface1,TestInterface2 {

	/**
	 * 
	 */
	
	public void show() {
		TestInterface1.super.show();
		TestInterface2.super.show();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaultUseCase d = new DefaultUseCase();
		d.show();
	}

}
