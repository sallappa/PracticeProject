package practcieExercises;

import java.util.Scanner;

public class fuelCalculator {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no of liters to fill the tank:");
		float noOfLiters=sc.nextFloat();
		
		if (noOfLiters<=0) {
			System.out.println(noOfLiters+"is invalid input");
		}
		System.out.println("Enter the distance covered:");
		float distance=sc.nextFloat();
		
		if (distance<=0) {
			System.out.println(distance+" is invalid input");
		}
		
		float fuelConsumption=(noOfLiters/distance)*100;
		
		float inMiles=(150*0.6214f);
		float fuelInGallons=(20*0.2642f);
		
		float milesBygallons=inMiles/fuelInGallons;
		
		System.out.println("Liters/100KM");
		System.out.println(fuelConsumption);
		System.out.println("Miles/gallons");
		System.out.println( milesBygallons);
		sc.close();
	}
}
