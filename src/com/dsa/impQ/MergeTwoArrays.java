package com.dsa.impQ;

import java.util.Arrays;

public class MergeTwoArrays {
	public static void main(String args[]) {
		int arr1[] = {1,2,3};
		int arr2[] = {4,5,6};
		int mergedArray[] = new int[arr1.length+arr2.length];
		
		for(int i = 0;i < mergedArray.length;i++) {
			if(i < arr1.length)
				mergedArray[i] = arr1[i];
			else
				mergedArray[i] = arr2[i-arr1.length];
		}
	

		System.out.println(Arrays.toString(mergedArray));
	}
}
