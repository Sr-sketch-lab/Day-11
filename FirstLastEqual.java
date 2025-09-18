package com.codegnan.arrays;

public class FirstLastEqual {

		    public static boolean firstLastEqual(int[] nums) {
		        // Check if array has length 1 or more
		        if (nums.length >= 1) {
		            return nums[0] == nums[nums.length - 1];
		        }
		        return false;
		    }

		    public static void main(String[] args) {
		        // Test cases
		        int[] arr1 = {1, 2, 3, 1};
		        int[] arr2 = {7, 5, 6, 7};
		        int[] arr3 = {0,5};
		        int[] arr4 = {2, 3, 4, 5};

		        System.out.println(firstLastEqual(arr1)); // true
		        System.out.println(firstLastEqual(arr2)); // true
		        System.out.println(firstLastEqual(arr3)); // true
		        System.out.println(firstLastEqual(arr4)); // false
		    }
		}
