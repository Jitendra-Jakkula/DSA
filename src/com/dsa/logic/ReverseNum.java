package com.dsa.logic;

public class ReverseNum {
	public static void main(String args[]) {
		int n = 121;
		int temp = n;
		int rev = 0;
		
		
		while(n != 0) {
			int digit = n%10;
			rev = (rev*10) + digit;
			n= n/10;
		}
		
		if(temp == (rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		System.out.println(rev);
		//added in dev1
		
	}
}
