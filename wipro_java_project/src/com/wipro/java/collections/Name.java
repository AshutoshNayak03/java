/**
 * 
 */
package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 */
class Name implements Comparator<Movie1> {

	/**
	 * 
	 */
	@Override
	public int compare(Movie1 m1, Movie1 m2) {
		// TODO Auto-generated method stub
		return m1.getName().compareTo(m2.getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie1>l=new ArrayList<>();
		l.add(new Movie1("Star Wars",8.7,1977));
		l.add(new Movie1("Empire Strikes Back",8.8,1980));
		l.add(new Movie1("Return of Jedi",8.4,1983));
		
		Collections.sort(l,new Name());
		System.out.println("movies after sort");
		for (Movie1 m:l) {
			System.out.println(m.getName()+"  "+m.getRating()+"  "+m.getYear());
		}
	}
	}

