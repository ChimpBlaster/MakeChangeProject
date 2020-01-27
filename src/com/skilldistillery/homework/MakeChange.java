package com.skilldistillery.homework;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int option = 0;
		/*
		 * do-while statement put in for continuous operation until you enter 2 to quit
		 * the program.
		 */
		do {

			System.out.print("Amount owed: ");
			double amtOwed = kb.nextDouble();
			System.out.print("Payment received: ");
			double amtTender = kb.nextDouble();

			calcChange(amtOwed, amtTender);

			System.out.println("\nEnter 1: New Item");
			System.out.println("Enter 2: Exit");
			option = kb.nextInt();

		} while (option != 2);

		kb.close();
	} // End main
	
	// Begin Method
	// Determines whether change is too little, too much, or just enough
	public static void calcChange(double amtOwed, double amtTender) {
		double amtDue = ((double) ((int) (amtOwed * 100) - (int) (amtTender * 100)) / 100);
		if (amtDue == 0) {
			System.out.println("\nAmount due: $" + amtDue);
			System.out.println("Thank you!");
		} else if (amtDue > 0) {
			System.out.println("\nAmount Due: $" + amtDue);
			System.out.println("You owe more money!");
		} else if (amtDue < 0) {
			System.out.println("\nChange: $" + -1 * amtDue);
			
			// Call to print out change in each denomination
			exactDenom(-1 * amtDue);
		}
	} // End of Method
	
	// Begin Method
	// Calculates denominations of change
	public static void exactDenom(double amtDue) {
		amtDue = amtDue * 100;
		// $50's
		if (amtDue >= 5000) {
			int fiftys = (int) amtDue / 5000;
			amtDue %= 5000;
			System.out.println(fiftys + " x $50");
		}
		// $20's
		if (amtDue >= 2000) {
			int twentys = (int) amtDue / 2000;
			amtDue %= 2000;
			System.out.println(twentys + " x $20");
		}
		// $10's
		if (amtDue >= 1000) {
			int tens = (int) amtDue / 1000;
			amtDue %= 1000;
			System.out.println(tens + " x $10");
		}
		// $5's
		if (amtDue >= 500) {
			int fives = (int) amtDue / 500;
			amtDue %= 500;
			System.out.println(fives + " x $5");
		}
		// $1's
		if (amtDue >= 100) {
			int ones = (int) amtDue / 100;
			amtDue %= 100;
			System.out.println(ones + " x $1");
		}
		// Quarters
		if (amtDue >= 25) {
			int quarters = (int) amtDue / 25;
			amtDue %= 25;
			System.out.println(quarters + " x Quarter");
		}
		// Dimes
		if (amtDue >= 10) {
			int dimes = (int) amtDue / 10;
			amtDue %= 10;
			System.out.println(dimes + " x Dime");
		}
		// Nickels
		if (amtDue >= 5) {
			int nickels = (int) amtDue / 5;
			amtDue %= 5;
			System.out.println(nickels + " x Nickel");
		}
		// Pennies
		if (amtDue >= 1) {
			int pennies = (int) amtDue / 1;
			amtDue %= 1;
			System.out.println(pennies + " x Penny");
		}
	} // End of Method

} // End of Class
