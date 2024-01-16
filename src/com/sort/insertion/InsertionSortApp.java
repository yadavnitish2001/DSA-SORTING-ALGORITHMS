package com.sort.insertion;

public class InsertionSortApp {
	public static int[] insertionsort(int[]arr) {
		for(int i=1;i<arr.length;i++) {
			int elem=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>elem) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=elem;
		}
		return arr;
	}

}
