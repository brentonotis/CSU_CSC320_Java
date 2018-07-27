
// Project Purpose: Develop app that prompts user to enter vehicle info and provides logical program output using appropriate data types

import java.util.Scanner;

public class CTA2 {
	
	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		String carMake = "";
		String carModel = "";
		int carYear = 0;
		int startingOdo = 0;
		int endingOdo = 0;
		int estMpg = 0;
		
		System.out.println("Enter vehicle make: ");
		carMake = scnr.nextLine();
		
		System.out.println("Enter vehicle model: ");
		carModel = scnr.nextLine();
		
		System.out.println("Enter vehicle year: ");
		carYear = scnr.nextInt();
		
		System.out.println("Enter starting odomoter: ");
		startingOdo = scnr.nextInt();
		
		System.out.println("Enter ending odomoter: ");
		endingOdo = scnr.nextInt();
		
		System.out.println("Enter estimated MPG: ");
		estMpg = scnr.nextInt();
		
		System.out.println("Vehicle: " + carYear + " " + carMake + " " + carModel);
		System.out.println("Starting Odometer: " + startingOdo);
		System.out.println("Ending Odometer: " + endingOdo);
		System.out.print("Estimated MPG: " + estMpg);
		
	}
}
