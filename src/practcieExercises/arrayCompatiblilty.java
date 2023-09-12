package practcieExercises;

import java.util.Scanner;

public class arrayCompatiblilty {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of the first array:");
		int size=sc.nextInt();
		if (size<=0) {
			System.out.println("Invalid array size");
			return;
		}
		int arr[]=new int[size];
		System.out.println("please elements of first array:");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("enter the size of the second array:");
		int size1=sc.nextInt();
		int arr1[]=new int[size1];
		System.out.println("please elements of first array:");
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=sc.nextInt();
		}
		
		if (arr.length == arr1.length) {
			System.out.println("Arrays are compatable");
		}else {
			System.out.println("Arrays are Not Compatible");
		}
		
		
	}

}
