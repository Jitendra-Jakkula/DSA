package com.dsa.faqs;

import java.util.Scanner;

public class ArmstrongNumber {
//	static int  noOfDigits(int num) {
//		int count= 0;
//		while(num !=0) {
//			count++;
//			num/=10;
//		}
//		return count;
//	}
	// 153 -> pow 3 1632-> 
	//12321

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;//to overcome mutablility problem....
//		int len = noOfDigits(num);
		int digits = String.valueOf(num).length();
		int sum = 0;
		while(num!=0) {
			int lastDigit = num % 10;
			sum+=(int) Math.pow(lastDigit,digits);
			num/=10;
		}
		System.out.println(temp==sum?"Armstrong Number":"Not Armstrong");
		sc.close();
	}

}
