package Sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void bubbleSort(int[] arr) {
        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {
            // Iterate through the array from the beginning to the (length - 1 - i) index
            // The largest element in each iteration will be placed at the end of the unsorted portion
            for (int j = 0; j < length - 1 - i; j++) {
                // Compare adjacent elements and swap if necessary
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array: " + Arrays.toString(arr));
        bubbleSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

}
