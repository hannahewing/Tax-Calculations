//Ewing, Hannah

package ProgrammingProjectPackage;

import java.util.Scanner;
import java.text.NumberFormat;

public class ProgrammingProject 
{
	public static void main( String [] args)
	{
		//Input decimal formatting and have the user input the annual income
		NumberFormat priceFormat = NumberFormat.getCurrencyInstance( );
		System.out.println("Your annual income: ");
		Scanner annual = new Scanner(System.in);
		double num = annual.nextDouble();
		
		//Calculate the users income tax
		double income = num * .03;
		System.out.println("Your Metropolis income tax: "
				+ priceFormat.format(income));
		
		//calculate the different services
		System.out.println("How your income tax is used for the betterment of Metropolis: ");
		double repair = income * .37;
		System.out.println("Infrastructure Repair/Maintenance: "
				+ priceFormat.format(repair));
		
		double prison = income * .26;
		System.out.println("Prison Security/Reinforcement: "
				+ priceFormat.format(prison));
		
		double kryp = income * .17;
		System.out.println("Kryptonite Removal and Disposal: "
				+ priceFormat.format(kryp));
		
		double villain = income * .12;
		System.out.println("Super-Villain Rehabilitation Program: "
				+ priceFormat.format(villain));
		
		double superman = income * .05;
		System.out.println("Superman Museum: "
				+ priceFormat.format(superman));
		
		double daily = income * .03;
		System.out.println("Daily Planet Newspaper Subsidy: "
				+ priceFormat.format(daily));
		
		//Final Statement
		System.out.println("Thank you for making Metropolis a \"super\" place to live!");
	}

}
