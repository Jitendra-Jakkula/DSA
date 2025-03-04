package mru.das.practice;

import java.util.HashSet;

public class FindUniqueEle {
	public static HashSet<Integer> findUniques(int arr[]){
		//using set (1)
		//for this approach we use 2 sets .. 1 -> to store all ememts and another to store only dublicats..
		HashSet<Integer> allEle = new HashSet<>();
		HashSet<Integer> duplicateEle = new HashSet<>();
		//now while adding to allEle we see if adding returns false the that is a duplicate as set cannnot store duplicates so store that in duplicate set..
		//the add method of set returns true or flase;
		for(int i: arr) {
			boolean res = allEle.add(i);
			if(!res) {
				//that mean it is unable to add that mean it is duplicate
				duplicateEle.add(i);
			}
			
		}
		//now as all the elements are stored in allEle set(not duplicates) and only the numbers that occured duplicate 
		//if we subtract duplicate form all we get our unique..
		//for this we use removeAll method to revmoe an entire set.
		
		allEle.removeAll(duplicateEle);
		return allEle;
		}
	//By suing hashMap 
	//TODO
	//----
	 public static void main(String args[]) {
	        int arr[] = {1, 2, 3, 1, 4, 3, 5, 2, 5, 2, 1, 3, 4, 1, 6};
	        System.out.println("Unique Elements: " + findUniques(arr));
	    }
}
