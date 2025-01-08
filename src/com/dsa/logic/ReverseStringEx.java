package com.dsa.logic;

public class ReverseStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		String str = "madam";
		//convet string to char array
		char[] ch = str.toCharArray();
		//declare 2 vars
		
		int st = 0;
		int end = ch.length-1;
		//declare infinite loop
		while(st<end) {
			char temp = ch[st];
			ch[st] = ch[end];
			ch[end]= temp;
			st++;
			end--;
		}
		//convert char arr to string
		String rev = new String(ch);
		if(str.equals(rev)) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not palindrome");
		}
		System.out.println(rev);
	}

}
