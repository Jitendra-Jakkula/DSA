package com.dsa.oops;

interface Interface1{
	public void addition();
	public int division(int n1 ,int n2);
}


//2
 interface Interface2{
	 public void multiplication();
	 public int add(int n1,int n2);
	 public int subtact(int n1,int n2);
	 public void multiply(int n1 , int n2);
 }
 
 class Test2 implements Interface2{

	@Override
	public void multiplication() {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 20;
		int res = num1*num2;
		System.out.println(res);
	}

	@Override
	public int add(int n1, int n2) {
		// TODO Auto-generated method stub
	
		return n1+n2;
	}

	@Override
	public int subtact(int n1, int n2) {
		// TODO Auto-generated method stub
		return n1-n2;
	}

	@Override
	public void multiply(int n1, int n2) {
		// TODO Auto-generated method stub
		System.out.println(n1*n2);
	}
	 
 }
class Test1 implements Interface1{

	@Override
	public void addition() {
		// TODO Auto-generated method stub
		int num1 = 100;
		int num2 = 50;
	
		int res = num1+num2;
		System.out.println(res);
	}

	@Override
	public int division(int n1,int n2) {
		// TODO Auto-generated method stub
		
		return n1/n2;
	}
	
}

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method 

		Test1 test = new Test1();
		test.addition();
		Test2 t2 = new Test2();
		t2.multiplication();
		int res1 = t2.add(100, 50);
		int res2 = t2.subtact(100,50);
		t2.multiply(res1, res2);
		int res3 = test.division(10,2);
		System.out.println(res3);
	}

}
