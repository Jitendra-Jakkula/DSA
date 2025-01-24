package mru.das.practice;

public class BinarySearchInfinteArray {
	static int binarySearch(int arr[],int target,int st,int end) {
		while(st<=end) {
			int mid = st+(end-st)/2;
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] > target) {
				end = mid-1;
			}else {
				st =  mid+1;
			}
		}
		return -1;
	}
	public static void main(String args[]) {
		 int[] arr = { 3, 5, 7, 9, 10, 90,
                 100, 130, 140, 160, 170 };

   int target = 10;
   //find the end of the seq ,,by think of binary serach dividing in reverse order..
   // form end the single element and check if the end index is greater than taget if yes we have found our rnage in which the target is presetn..
   int end = 1;
   int st = 0;
   
   while( target > arr[end]) { //jab thak mera arr[i],target se bada nahi hota
	   int pow = (end-st);
	   int temp = end;
	      end = (int)Math.pow(2, pow);
	      
   }
   System.out.println(binarySearch(arr, target, st, end));
   
	}
}
