package com.sort.quick;

public class QuickSortApp {
	  public static void quicksort(int[] arr, int low, int high) {
	        if (low < high) {
	            // Partition the array into two halves and get the pivot index
	            int pivotIndex = partition(arr, low, high);

	            // Recursively sort the subarrays
	            quicksort(arr, low, pivotIndex - 1);
	            quicksort(arr, pivotIndex + 1, high);
	        }
	    }

	    private static int partition(int[] arr, int low, int high) {
	        // Choose the rightmost element as the pivot
	        int pivot = arr[high];

	        // Index of the smaller element
	        int i = low - 1;

	        // Traverse through the array and rearrange elements
	        for (int j = low; j < high; j++) {
	            if (arr[j] < pivot) {
	                i++;
	                // Swap arr[i] and arr[j]
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	        // Swap arr[i+1] and arr[high] to place the pivot in the correct position
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        // Return the index of the pivot element
	        return i + 1;
	    }
	}
