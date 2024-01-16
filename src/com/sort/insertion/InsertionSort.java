package com.sort.insertion;

import java.util.Scanner;

import com.sort.selection.SelectionSortApp;

public class InsertionSort {

	public static void main(String[] args) {
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
		InsertionSortApp.insertionsort(arr);
		for(int s:arr) {
			System.out.print(s+" ");
		}
	}


}


