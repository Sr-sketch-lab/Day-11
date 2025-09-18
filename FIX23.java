package com.codegnan.arrays;

import java.util.Arrays;

public class FIX23 {
// access modifier return type methodname(arguments);
	
	public static int[] fix23(int[] nums) {
		if(nums[0]==2&&nums[1]==3) {
			nums[1]=0;
		}
		if(nums[1]==2&&nums[2]==3) {
			nums[2]=0;
		}
		return nums;
	}
	
	/*public static void pointArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		System.out.println();
	}*/
	public static void printArray(int[] arr) {
		System.out.print("[");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			if(i<arr.length-1) {
				System.out.print(",");
			}
		}
		System.out.println("]");
	}
	public static void main(String[] args) {
		int[][] testCases= {{1,2,3,},
				{2,3,0},
				{1,2,2},
				{1,0,3},
				{3,2,3},
				{2,2,0},
				{3,3,2}};
		/*int[] arr1= {1,2,3};
		int[] arr2= {2,3,4};
		int[] arr3= {3,4,5};*/
		// System.out.println(Arrays.toString(fix23(arr1)));
		for(int i=0;i<testCases.length;i++) {
			int[] result=fix23(testCases[i]);
			System.out.print("testCase: "+(i+1) +" ");
			printArray(result);
		}
	
	}

}
