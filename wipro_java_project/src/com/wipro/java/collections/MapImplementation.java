/**
 * 
 */
package com.wipro.java.collections;

import java.util.*;

/**
 * 
 */
public class MapImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map =new HashMap<>();
		map.put(1, "Apple");
		map.put(2,"Banana");
		map.put(3, "Cherry");
		
		System.out.println("Key 1:"+map.get(1));
		System.out.println("Key 1:"+map.get(2));
		
		if(map.containsKey(3)) {
			System.out.println("Key 3 exists with value :"+map.get(3));
		}
		
		System.out.println("\n iterating through the loop");
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
		
		map.remove(2);
		
		System.out.println("\n map after removal of key:2");
		for(Map.Entry<Integer, String> entry:map.entrySet()) {
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}

}
