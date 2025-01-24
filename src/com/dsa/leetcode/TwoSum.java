package com.dsa.leetcode;

import java.util.Arrays;

public class TwoSum {
	static int[] frequency(int arr[]) {
		if(arr.length == 0) {
			return arr;
		}
		int ans[] = new int[arr.length];
		
		for(int i =0;i<ans.length;i++) {
			int num = arr[i];
			int count=0;
			for(int j = 0;j<arr.length;j++) {
				if(arr[j]== num) {
					count++;
				}
			}
			ans[i] = count;
		}
		return ans;
	}
public static void main(String args[]) {
	int arr[] = {1,2,1,2,3,4};
	int ans[] = frequency(arr);
	System.out.println(Arrays.toString(ans));
}
}
