package practcieExercises;

import java.util.Scanner;

public class BillGenerator {
	public static void main(String[] args) {
		int pizzaPrice=100;
		int buffPrice=20;
		int coolDrink=10;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of pizzas bought:");
		int noOfPizzas=sc.nextInt();
		System.out.println(" Enter the no of puffs bought:");
		int noOfBuffs=sc.nextInt();
		System.out.println("Enter the no of cool drinks bought:");
		int noOfCooldrinks=sc.nextInt();
		
		System.out.println("bill details");
		System.out.println("No of pizzas:"+noOfPizzas);
		System.out.println("No of puffs:"+ noOfBuffs);
		System.out.println("No of cooldrinks:"+ noOfCooldrinks);
		int total=pizzaPrice*noOfPizzas + buffPrice*noOfBuffs + coolDrink*noOfCooldrinks;
		System.out.println("total price:"+total);
		System.out.println("enjoy the show !!");
		sc.close();
	}

}
