package practiceProjects;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		//user input
		System.out.println("enter your size of the array");
		Scanner sc=new Scanner(System.in);
		int sai=sc.nextInt();
		//create an array
		int arr[][]=new int [sai][];
		for (int i = 0; i < sai; i++) {
			System.out.println("enter col size:"+i);
			int cs=sc.nextInt();
			arr[i]=new int[cs];
			System.out.println("enter your values:"+i);
			for (int j = 0; j < cs; j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//print an array
		System.out.println("input1");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		//sum of the array
		int sum=0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];
			}

		}
		System.out.println();
		System.out.println("sum out put");
		System.out.println(sum);
		System.out.println();
		//two dimentional array
		int [][]outarr=new int[arr.length][];
		for (int i = 0; i < arr.length; i++) {
			outarr[i]=new int[arr[i].length];
			for (int j = 0; j < arr.length; j++) {
				outarr[i][j]=(int) Math.pow(arr[i][j],2);
			}
		}
		System.out.println("input1");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println();
		//square root of array
		System.out.println("square Output:");
		for (int i = 0; i < outarr.length; i++) {
			System.out.println(Arrays.toString(outarr[i]));
		}
		System.out.println();
		System.out.println("enter array size2");
		int icon=sc.nextInt();
		int [][]arr1=new int [icon][];
		for (int i = 0; i <icon; i++) {
			System.out.println("enter column size:"+i);
			int cs1=sc.nextInt();
			arr1[i]=new int[cs1];
			System.out.println("enter column values:"+i);
			for (int j = 0; j < cs1; j++) {
				arr1[i][j]=sc.nextInt();
			}
		}
		System.out.println("input1");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		System.out.println();
		System.out.println("input2");
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(Arrays.toString(arr1[i]));
		}
		int [][]arr2=new int[arr.length][];
		// sum of two arrays
		for (int i = 0; i < arr.length; i++) {
			arr2[i]=new int[arr[i].length];
			for (int j = 0; j < arr[i].length; j++) {
				arr2[i][j]=arr[i][j]+arr1[i][j];
			}
		}
		System.out.println();
		System.out.println("sum of the arrays output");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
		//subtraction of two array
		int [][]arr5=new int[arr.length][];
		for (int i = 0; i < arr.length; i++) {
			arr5[i]=new int[arr[i].length];
			for (int j = 0; j < arr[i].length; j++) {
				arr5[i][j]=arr[i][j]-arr1[i][j];
			}
		}
		System.out.println();
		System.out.println("subtraction of the arrays output");
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(Arrays.toString(arr2[i]));
		}
		//if two arrays are same print 1 else 0 for array
		int arr3[][]=new int[arr.length][];
		for (int i = 0; i < arr.length; i++) {
			arr3[i]=new int [arr[i].length];
			for (int j = 0; j < arr2[i].length; j++) {
				if (arr[i][j]==arr1[i][j]) 
					arr3[i][j]=1;
				else
					arr3[i][j]=0;

			}
		}
		System.out.println();
		System.out.println("same or not output");
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(Arrays.toString(arr3[i]));
		}

		sc.close();
	}

}
