package com.dsa.faqs;

import java.util.Scanner;

public class CheckEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String res = num%2 == 0?"Even":"Odd";
		
		
		System.out.println(res);
		sc.close();
		
	}

}
