package com.sort.selection;

public class SelectionSortApp {
	public static int[] selectionsort(int[]arr) {
		for(int i=0;i<arr.length-1;i++){
			int min=arr[i];
			int pos=i;
			for(int j=i+1;j<arr.length;j++) {
				if(min>arr[j]) {
					min=arr[j];
					pos=j;
				}
			}
			int temp=arr[pos];
			arr[pos]=arr[i];
			arr[i]=temp;
		}
		return arr;
	}

}
