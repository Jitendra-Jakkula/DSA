package com.dsa.oops;

public class Oops1 {
	public static void main(String args[]) {
		GrandChild grandChild = new GrandChild();
		int x = grandChild.num1;
		int c = x;
		int rev = 0;
		while(x !=0) {
			int digit = x%10;
			rev = rev*10 + digit;
			x/=10; 
		}
		System.out.println(rev);
		int y = grandChild.num2;
		int z = grandChild.num3;
		System.out.println(y+z);
		int a = grandChild.num4;
		System.out.println(y+z-a);
		
		String s = Integer.toString(c);
		System.out.println(s);
		String res = "";
		for(int i = s.length()-1;i>=0;i--) {
			char j = s.charAt(i);
			res+=j;
		}
		System.out.println(res);
	}
}
