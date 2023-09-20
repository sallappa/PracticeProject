package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class ExponentialSearch {

    public static int exponentialSearch(int[] arr, int target) {
        int length = arr.length;
        if (arr[0] == target) {
            return 0; // Target found at index 0
        }

        // Find the range for binary search
        int i = 1;
        while (i < length && arr[i] <= target) {
            i *= 2;
        }

        // Perform binary search within the identified range
        return binarySearch(arr, target, i / 2, Math.min(i, length - 1));
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Target found at mid index
            } else if (arr[mid] < target) {
                left = mid + 1; // Discard left half
            } else {
                right = mid - 1; // Discard right half
            }
        }

        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        System.out.println("array");
        System.out.println(Arrays.toString(arr));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a value to search:");
        int target = sc.nextInt();
        int result = exponentialSearch(arr, target);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index " + result);
        }
        sc.close();
    }
}

