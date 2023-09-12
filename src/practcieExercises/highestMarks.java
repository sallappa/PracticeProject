package practcieExercises;

import java.util.Scanner;

public class highestMarks {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter no of semisters");
		int noOfSemisters=sc.nextInt();
		System.out.println("Enter no of subjects in 1 semester:");
		int noOfSubIn1sem=sc.nextInt();
		System.out.println("Enter no of subjects in 2 semester:");
		int noOfSubIn2sem=sc.nextInt();
		System.out.println("Enter no of subjects in 3 semester:");
		int noOfSubIn3sem=sc.nextInt();

		int sem1marks[]=new int[noOfSubIn1sem];

		System.out.println("marks obtained in semister1:");

		for (int i = 0; i < sem1marks.length; i++) {
			sem1marks[i]=sc.nextInt();
			if (sem1marks[i]<=0) {
				System.out.println("you have entered invalid marks");
				return;
			}
		}
	
		int maxMarkssem1=sem1marks[0];

		for (int i = 0; i < sem1marks.length; i++) {
			if (maxMarkssem1 < sem1marks[i]) {
				maxMarkssem1=sem1marks[i];
			}
		}
		

		int sem2marks[]=new int[noOfSubIn2sem];

		System.out.println("marks obtained in semister2:");

		for (int i = 0; i < sem2marks.length; i++) {
			sem2marks[i]=sc.nextInt();
			if (sem2marks[i]<=0) {
				System.out.println("you have entered invalid marks");
				return;
			}
		}
		int maxMarkssem2=sem2marks[0];

		for (int i = 0; i < sem2marks.length; i++) {
			if (maxMarkssem2 < sem2marks[i]) {
				maxMarkssem2=sem2marks[i];
			}
		}
		

		int sem3marks[]=new int[noOfSubIn3sem];

		System.out.println("marks obtained in semister3:");

		for (int i = 0; i < sem3marks.length; i++) {
			sem3marks[i]=sc.nextInt();
			if (sem3marks[i]<=0) {
				System.out.println("you have entered invalid marks");
				return;
			}
		}
		int maxMarkssem3=sem3marks[0];

		for (int i = 0; i < sem3marks.length; i++) {
			if (maxMarkssem3 < sem3marks[i]) {
				maxMarkssem3=sem3marks[i];
			}
		}
		
		System.out.println("maximum marks in semister 1:"+maxMarkssem1);
		System.out.println("maximum marks in semister 2:"+maxMarkssem2);
		System.out.println("maximum marks in semister 3:"+maxMarkssem3);
	}

}
