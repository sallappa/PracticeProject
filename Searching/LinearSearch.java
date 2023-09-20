package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index where the target is found
            }
        }
        return -1; // Return -1 if the target is not found
    }

    public static void main(String[] args) {
        int[] numbers = {5, 3, 8, 4, 2};
        System.out.println("array");
        System.out.println(Arrays.toString(numbers));
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search: ");
        int target = scanner.nextInt();

        int index = linearSearch(numbers, target);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found");
        }
        scanner.close();
    }
}