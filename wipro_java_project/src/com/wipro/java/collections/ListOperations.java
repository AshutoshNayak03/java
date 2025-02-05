/**
 * 
 */
package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
public class ListOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l1= new ArrayList<Integer>();
		
		l1.add(0,1);//position,value
		l1.add(1,2);
		l1.add(2,2);
		
		System.out.println(l1);
		
		//custom inputs
		List<Integer> l2= new ArrayList<Integer>();
		l2.add(1);
		l2.add(2);
		l2.add(3);
		
		//will add list l2 from 1 index in l1
		l1.addAll(1,l2);//size or memory not fixed
		
		System.out.println(l1);
		
		//removes element from index 1
		l1.remove(1);
		System.out.println(l1);

		//using get method for printing index3 from list 1
		System.out.println(l1.get(3));
		
		//use of .set method
		l1.set(0, 5);
		
		System.out.println(l1);
		
		
	}

}
