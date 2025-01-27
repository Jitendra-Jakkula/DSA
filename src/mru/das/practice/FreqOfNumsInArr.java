package mru.das.practice;

import java.util.HashMap;

public class FreqOfNumsInArr {
	static void freqOfNums(int arr[]) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int ele : arr) {
			map.put(ele, map.getOrDefault(ele,0)+1);
		}
//		System.out.println(map);
		for(HashMap.Entry<Integer,Integer> entry: map.entrySet()) {
			System.out.println(entry.getKey()+"Frequency :"+entry.getValue());
		}
		
	}
	public static void main(String args[]) {
		int arr[] = {1,2,2,3,3,4,4};
		freqOfNums(arr);
	}
}
