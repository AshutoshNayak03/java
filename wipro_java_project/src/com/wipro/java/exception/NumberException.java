/**
 * 
 */
package com.wipro.java.exception;

/**
 * 
 */
public class NumberException {

	/**
	 * 
	 */
	static int i=10;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=30,j=0,data;
		try {
		data= i/j;
	}
		catch(Exception e) {
			System.out.println(e.toString());
		}
		finally {
			System.out.println("i am always executed");
		}

}
}
