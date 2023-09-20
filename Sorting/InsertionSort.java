package Sorting;

import java.util.Arrays;

public class InsertionSort {
	public static void insertionSort(int[] arr) {
        int length = arr.length;

        for (int i = 1; i < length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Move elements greater than the key to one position ahead of their current position
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};
        System.out.println("Original array: " + Arrays.toString(arr));
        insertionSort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }

}
