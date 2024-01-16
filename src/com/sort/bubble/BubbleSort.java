package com.sort.bubble;

import java.util.Scanner;

import com.bubblesort.array.BubbleSortApp;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		//creating an array
		int[]arr=new int[size];
		//Taking an input
		for(int i =0;i<arr.length;i++) {
			System.out.println("Enter the  "+(i+1)+"th element");
			arr[i]=sc.nextInt();
		}
		//Displaying the elements before sorting
		System.out.println("The elements are in arrays Before sorting");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		//invoking the methods
		System.out.println("After sorting");
		BubbleSortApp.bubblesort(arr);
		for(int s:arr) {
			System.out.print(s+" ");
		}

	}

}
