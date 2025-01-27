package mru.das.practice;
import java.util.*;
public class FrequencyOfNumbers {
	static HashMap<Integer,Integer >freqOfNm(int arr[]) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i<arr.length;i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i],map.get(arr[i])+1);
			}else {
				map.put(arr[i], 1);
			}
		}
		return map;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,2,3,3,3,4,4,4,4};
		HashMap<Integer,Integer> map = freqOfNm(arr);
		System.out.println(map);
		
	}

}
