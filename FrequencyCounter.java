package com.codegnan.arrays;

public class FrequencyCounter {

	public static void main(String[] args) {
		//initialize the array with some sample elements
		int[] array= {1,2,3,2,1,4,3,5,1};
		
		//boolean array to track which elements have been processed already
		boolean[] processed=new boolean[array.length];
		
		//outer for loop to iterate over each element in the array
		for(int i=0;i<array.length;i++) {
			// if the element at index i has already been processed skip it
			if(processed[i]) {
				continue;
			}
			int count=1;
			//inner for loop to compare the current element with the rest of elements
			for(int j=i+1;j<array.length;j++) {
				//if the element at index j is equal to the element at index i then perform
				if(array[j]==array[i]) {
					count++;
					processed[j]=true;
				}
			}
			System.out.println(array[i]+ " Occurs " +count+ " times ");
		}
 
	}

}
