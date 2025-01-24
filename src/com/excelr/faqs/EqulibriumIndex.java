package com.excelr.faqs;
public class EqulibriumIndex {

	public static void main(String[] args) {
		int[] array= {-7,1,5,2,-4,3,0};
		int totalSum=0,leftsum=0;
		boolean flag=false;
		for(int element:array) {
			totalSum+=element;
		}
        for(int i=0;i<array.length;i++) {
        	totalSum=array[1];
        	if (totalSum==leftsum) {
        		System.out.println("Equilibrium Point ;"+1);
        		flag=true;
        		break;
        	}else {
        		leftsum=array[1];
        	}
        }
        if(!flag)
        	System.out.print("Equilibrium not found !!!");
	}

}
