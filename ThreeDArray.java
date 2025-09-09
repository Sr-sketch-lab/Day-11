package com.codegnan.arrays;

import java.util.Scanner;

public class ThreeDArray {

	public static void main(String[] args) {
		//int[][][] a= {{{10,20,30},{40,50}},{{60},{70,80},{90,100,110}}};
		//System.out.println(a[0][1][1]);
		//System.out.println(a[1][0][0]);
		//System.out.println(a[1][2][1]);
		//System.out.println(a[1][2][2]);
		//System.out.println(a[1][1][0]);
		//System.out.println(a[1][1][1]);
		
		int[][] numbers= {{100,110,45},{60,80}};
		/*for (int i=0; i<numbers.length;i++) {
			for (int j =0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Printing 2d array in enhanced for loop");
		for(int[] row:numbers) {
			for(int x:row) {
				System.out.print(x+" ");
			}
			System.out.println();
		}*/
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int rows=scanner.nextInt();
		System.out.println("Enter number of columns");
		int columns=scanner.nextInt();
		
		int[][] arr=new int[rows][columns];
		
		System.out.println("Enter elements into an Array");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<columns;j++) {
				System.out.print("Elements ["+i+"]["+j+"]:");
				arr[i][j]=scanner.nextInt();
			}
		}
		System.out.println("Printing 2d array in enhanced for loop");
		for(int[] row:numbers) {
			for(int x:row) {
				System.out.print(x+" ");
			}
			System.out.println();
		}
		scanner.close();
	}
}


//sum of elements in 2d array
//row wise sum,row wise product
//column wise sum,column wise product
//add matrices
//multiply two matrices