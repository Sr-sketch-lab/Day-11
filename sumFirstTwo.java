package com.codegnan.arrays;

public class sumFirstTwo {
	public static int sumFirstTwo(int[] arr) {
		if(arr.length == 0) {
			return 0;
		}else if(arr.length == 1) {
			return arr[0];
		}else {
			return arr[0]+arr[1];
		}
	}

	public static void main(String[] args) {
		int[] arr1= {1,2,3};
		int[] arr2= {5,5};
		int[] arr3= {8,3,1,4};
		int[] arr4= {6};
		System.out.println(sumFirstTwo(arr1));
		System.out.println(sumFirstTwo(arr2));
		System.out.println(sumFirstTwo(arr3));
		System.out.println(sumFirstTwo(arr4));

	}

}
