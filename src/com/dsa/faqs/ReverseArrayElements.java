package com.dsa.faqs;

import java.util.Arrays;

public class ReverseArrayElements {
	public static void main(String args[]) {
		int arr[] = {1,2,3,5,6,7,8};
		int st =  0;
		int end = arr.length-1;
//		for(int i =0;i<arr.length/2;i++){
//			int temp = arr[st];
//			arr[st] = arr[end];
//			arr[end] =temp;
//			end--;
//			st++;
//		}
		//while
		while(st<end) {
			int temp = arr[st];
			arr[st] = arr[end];
			arr[end] =temp;
			end--;
			st++;
		}
		System.out.println(Arrays.toString(arr));
		for(int i : arr) {
			System.out.print(i+" ");
		}
	}
}
