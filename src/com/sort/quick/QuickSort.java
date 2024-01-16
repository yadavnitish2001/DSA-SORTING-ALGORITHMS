package com.sort.quick;

import java.util.Scanner;
public class QuickSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size=sc.nextInt();
		//create an array
		int[]arr=new int[size];

		//storing the elements in array
		System.out.println("Enter the "+arr.length+" elements in array");
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("Enter the "+(i+1)+" elements");
			arr[i]=sc.nextInt();
		}
		//Displaying the array
		System.out.println("Before Sorting");
		for(int s:arr) {
			System.out.print(s+" ");
		}
		System.out.println();
		//invoking the methods
		System.out.println("After sorting");
		QuickSortApp.quicksort(arr, 0, arr.length-1);
		for(int s:arr) {
			System.out.print(s+" ");
		}

	}

}
