package com.dsa.faqs;

public class ArrayEquilibriumIndex {
	public static void main(String args[]) {
	int arr[] = {-7,1,5,2,-4,3,0};
	int leftSum = 0;
	int totalSum = 0;
	for(int i : arr) {
		totalSum += i;
	}
	for(int i = 0; i<arr.length;i++) {
		totalSum -= arr[i];
		//check for equilibrium 
		if(totalSum == leftSum) {
			System.out.println("Equilibrium Point: "+ i);//at this point equilibrium occurs...if it occurs then we break from it ..
			break;
		}else {
			leftSum+=arr[i];
		}
	}
	}
}
