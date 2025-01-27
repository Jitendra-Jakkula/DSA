package mru.das.practice;

import java.util.HashSet;

public class DuplicatesOrnot {
	static boolean checkForDuplicates(int arr[]) {
		HashSet<Integer> set = new HashSet<>();
		for(int ele : arr) {
			if(set.contains(ele)) {
				return true;
			}
			set.add(ele);
		}
		return false;
	}
	
	public static void main(String args[]) {
		int arr[] = {1,2,3};
		System.out.println(checkForDuplicates(arr)?"Duplicates Found":"Duplicates Not found");
	}
}
