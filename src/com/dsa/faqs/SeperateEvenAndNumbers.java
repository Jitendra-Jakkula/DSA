package com.dsa.faqs;

import java.util.Arrays;

public class SeperateEvenAndNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		
		int even=0,odd=0;
		for(int i:arr) {
			even+= i %2 == 0?1:0;
			odd += i %2 !=0 ?1:0;
		}
		int arr1[]= new int[even];
		int arr2[] = new int[odd];
		int evenIndex = 0;
		int oddIndex = 0;
		for(int j : arr){
			if(j % 2 == 0){
				arr1[evenIndex++] = j;
			}else {
				arr2[oddIndex++] = j;
			}
		}
		
		for(int i : arr1) {
			System.out.println(i);
		}
		for(int i: arr2) {
			System.out.println(i);
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
	}

}
