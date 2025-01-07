package com.dsa.methods;

public class Methods {
	public void leetCode() {
		System.out.println("welcome to leetcode");
	}
	
	public void codeChef(String name) {
		System.out.println("Welcome to "+name);
	}
	public String hackerRank() {
		return "Bye Bye !!!";
	}
	public String wish(String name) {
		return "Welcome to name " + name;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methods m = new Methods();
		m.leetCode();
		m.codeChef("Logic Building Sessions !!!");
		
		String s = m.hackerRank();
		System.out.println(s);
		String s1 =m.wish("mru");
		System.out.println(s1);
		}
}
