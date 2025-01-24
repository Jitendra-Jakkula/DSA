package com.dsa.faqs;

public class FibonacciSeq {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] fib = new int[10];
		fib[0] = 0;
		fib[1] = 1;
		for(int i = 2;i<fib.length;i++) {
			fib[i] = fib[i-1] + fib[i-2];
		}
		for(int i :fib) {
			System.out.println(i);
		}

	}

}
