/**
 * 
 */
package com.wipro.java.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 */
public class Movie implements Comparable<Movie>{

	/**
	 * 
	 */
	private String n;
	private double r;
	private int y;
	
	/**
	 * @return the n
	 */
	
	public Movie(String n,double r, int y) {
		// TODO Auto-generated constructor stub
		this.n=n;
		this.r=r;
		this.y=y;
		
	}

	
	
	public String getName() {
		return n;
	}


	/**
	 * @return the r
	 */
	public double getRating() {
		return r;
	}


	/**
	 * @return the y
	 */
	public int getYear() {
		return y;
	}




	@Override
	public int compareTo(Movie m) {
		// TODO Auto-generated method stub
		return Double.compare(this.r, m.r);

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie>l=new ArrayList<>();
		l.add(new Movie("Star Wars",8.7,1977));
		l.add(new Movie("Empire Strikes Back",8.8,1980));
		l.add(new Movie("Return of Jedi",8.4,1983));
		
		Collections.sort(l);
		System.out.println("movies after sort");
		for (Movie m:l) {
			System.out.println(m.getName()+"  "+m.getRating()+"  "+m.getYear());
		}
	}

}
