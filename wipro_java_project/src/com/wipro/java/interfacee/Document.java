/**
 * 
 */
package com.wipro.java.interfacee;

/**
 * 
 */
public class Document implements Printable,Showable{

	/**
	 * @param args
	 */
	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("show");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("print");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc=new Document();
		doc.show();
		doc.print();
	}



}
