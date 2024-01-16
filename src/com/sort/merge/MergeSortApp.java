package com.sort.merge;

public class MergeSortApp {
    public static void Divide(int arr[], int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            Divide(arr, start, mid);
            Divide(arr, mid + 1, end);

            // Perform merging of the two halves
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int arr[], int start, int mid, int end) {
        // Calculate the sizes of the two subarrays to be merged
        int n1 = mid - start + 1;
        int n2 = end - mid;

        // Create temporary arrays to hold the values of the two subarrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[start + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        // Merge the two subarrays back into the original array
        int i = 0, j = 0, k = start;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArray[], if any
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArray[], if any
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }
}
