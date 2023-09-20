package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index where the target is found
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] numbers = {2, 4, 8, 12, 16, 20};
        System.out.println("array");
        System.out.println(Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search: ");
        int target = scanner.nextInt();

        Arrays.sort(numbers); // Binary search requires a sorted array

        int index = binarySearch(numbers, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
        scanner.close();
    }
}
