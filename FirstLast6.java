package com.codegnan.arrays;

public class FirstLast6 {
	public static boolean firstLast6(int[] nums) {
        // Check if first or last element is 6
        return (nums[0] == 6 || nums[nums.length - 1] == 6);
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 1, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {13, 6, 1, 2, 3};
        int[] arr4 = {6};

        System.out.println(firstLast6(arr1)); // true
        System.out.println(firstLast6(arr2)); // true
        System.out.println(firstLast6(arr3)); // false
        System.out.println(firstLast6(arr4)); // true
    }
}
 
    
