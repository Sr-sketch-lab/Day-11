package com.codegnan.arrays;

public class TwoDArray {

	public static void main(String[] args) {
		int[][][] a=new int[2][][];
		a[0] = new int[3][];
		a[0][0] = new int[1];
		a[0][1] = new int[2];
		a[0][2] = new int[3];
		a[1] = new int[2][2];
		a[0][1][0]=100;
		a[0][0][0]=80;
		a[0][1][1]=60;
		a[0][2][0]=40;
		a[0][2][2]=20;
		System.out.println(a[0][1][0]);
		System.out.println(a[0][0][0]);
		System.out.println(a[0][1][1]);
		System.out.println(a[0][2][0]);
		System.out.println(a[0][2][2]);
		System.out.println(a[1][0][0]);

	}

}
