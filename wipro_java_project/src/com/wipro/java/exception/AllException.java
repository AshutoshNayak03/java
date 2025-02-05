/**
 * 
 */
package com.wipro.java.exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 */
public class AllException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Checked Exception
		try {
			File file = new File("Dummy path");
			FileReader reader =new FileReader(file);
			
		}
		catch(IOException e) {
			System.out.println(e);
		}
		
		//Unchecked Exception
		try {
			String s= null;
			System.out.println(s.length());

	}
		catch(Exception e){
			System.out.println(e);
			}
		}

	}

