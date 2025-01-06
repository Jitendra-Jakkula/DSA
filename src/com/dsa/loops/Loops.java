package com.dsa.loops;

public class Loops {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {100,200,300,400,500};
		int ele = arr[0];
		System.out.println("0th Indexed element : "+ele);
		System.out.println("1st Indexed element : "+arr[1]);
		System.out.println("2nd Indexed element : "+arr[2]);
		System.out.println("3rd Indexed element : "+arr[3]);
		System.out.println("4th Indexed element : "+arr[4]);
		int n = arr.length;
		System.out.println("No of elements : "+n);
		//for loop
		for(int i = 0 ;i<n;i++) {
			System.out.println(arr[i]);
		}
		for(int i : arr) {
			System.out.println(i);
		}
		int i = 0;
		while(i<n) {
			System.out.println(arr[i]);
			i++;		
			}
		System.out.println("Do-while loop");
		int x = 0;
		do {
			System.out.println(arr[x]);
			x++;
		}while(x<n);
		
	}
	

}
