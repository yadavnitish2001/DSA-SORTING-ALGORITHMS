package com.sort.bubble;

public class BubbleSortApp {
	public static int [] bubblesort(int[]arr) {
		int temp;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j+1];
					arr[j+1]=arr[i];
					arr[i]=temp;
				}
			}
		}
		return arr;
	}
}
