package com.dsa.oops;

public class Oops2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GrandChild1 grandChild1 = new GrandChild1(); 
		grandChild1.wish1();
		grandChild1.wish2("Jitu");
		String s=  grandChild1.wish3();
		String s2 = grandChild1.wish4("jitu");

		System.out.println(s);
		System.out.println(s2);
	}

}
